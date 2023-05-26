package com.sudip.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ORDER_DETAILS")
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;

    private Long productId;
    private Integer orderQuantity;
    private Instant orderDate;
    private String orderStatus;
    private Double orderAmount;

}
