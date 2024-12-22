package com.order.order.commen;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.order.order.dto.OrderDTO;
import lombok.Getter;

@Getter
public class SuccessOrderResponse implements OrderResponse{
    @JsonUnwrapped
    private final OrderDTO order;

    public SuccessOrderResponse(OrderDTO order) {
        this.order = order;
    }
}
