package com.sudip.orderservice.service.impl;

import com.sudip.orderservice.dtos.OrderRequestDTO;
import com.sudip.orderservice.entity.Order;
import com.sudip.orderservice.repository.OrderRepository;
import com.sudip.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Long placeOrder(OrderRequestDTO orderRequestDTO) {
        //Order entity--> Save the data with order status created
        //Product service-->Block Product(Reduce the quantity)
        //Payment Service-->Payment--> Success-->Complete--> Else-->CANCLED
        log.info("Placing Order request: {}", orderRequestDTO);
        Order order = Order.builder()
                .orderAmount(orderRequestDTO.getOrderAmount())
                .orderDate(Instant.now())
                .orderStatus("CREATED")
                .productId(orderRequestDTO.getProductId())
                .orderQuantity(orderRequestDTO.getOrderQuantity())
                .build();


        Order saveOrder = orderRepository.save(order);
        log.info("Order is Placed successfully with order Id: {}", saveOrder.getOrderId());


        return saveOrder.getOrderId();
    }
}
