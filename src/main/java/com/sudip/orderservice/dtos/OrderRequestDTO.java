package com.sudip.orderservice.dtos;

import com.sudip.orderservice.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequestDTO {

    private Long productId;
    private Integer orderQuantity;
    private Double orderAmount;
    private PaymentMode paymentMode;
}
