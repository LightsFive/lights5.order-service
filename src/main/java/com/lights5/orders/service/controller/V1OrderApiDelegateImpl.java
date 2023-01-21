package com.lights5.orders.service.controller;


import com.lights5.orders.service.api.V1ApiDelegate;
import com.lights5.orders.service.model.Order;
import com.lights5.orders.service.model.Status;
import com.lights5.orders.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static com.lights5.orders.service.model.Status.IdEnum.HEALTHY;

@RestController
public class V1OrderApiDelegateImpl implements V1ApiDelegate {

    @Autowired
    private OrderService service;
    @Override
    public ResponseEntity<Order> getOrdersOrderId(String orderId) {
        return V1ApiDelegate.super.getOrdersOrderId(orderId);
    }

    @Override
    public ResponseEntity<Status> getV1Health() {

        return  new ResponseEntity<>(new Status().id(HEALTHY),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> postOrder(Order order) {
        return V1ApiDelegate.super.postOrder(order);
    }
}
