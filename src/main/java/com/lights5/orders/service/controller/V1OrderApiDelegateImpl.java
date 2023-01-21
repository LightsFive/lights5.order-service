package com.lights5.orders.service.controller;


import com.lights5.orders.service.api.V1ApiDelegate;
import com.lights5.orders.service.model.Order;
import org.springframework.http.ResponseEntity;

public class V1OrderApiDelegateImpl implements V1ApiDelegate {

    @Override
    public ResponseEntity<Order> getOrdersOrderId(String orderId) {
        return V1ApiDelegate.super.getOrdersOrderId(orderId);
    }
}
