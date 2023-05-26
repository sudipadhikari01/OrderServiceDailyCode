package com.sudip.orderservice.controller;

import com.sudip.orderservice.dtos.OrderRequestDTO;
import com.sudip.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@Log4j2
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/placeOrder")
    public ResponseEntity<?> placeOrder(@RequestBody OrderRequestDTO orderRequestDTO) {
        Long order = orderService.placeOrder(orderRequestDTO);
        log.info("Order Id: {}", order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }
}
