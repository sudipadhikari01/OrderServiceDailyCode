package com.sudip.orderservice.service;

import com.sudip.orderservice.dtos.OrderRequestDTO;

public interface OrderService {
    Long placeOrder(OrderRequestDTO orderRequestDTO);
}
