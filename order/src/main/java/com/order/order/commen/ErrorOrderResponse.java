package com.order.order.commen;

import lombok.Getter;

@Getter
public class ErrorOrderResponse implements OrderResponse{
    private final String errMsg;

    public ErrorOrderResponse(String errMsg) {
        this.errMsg = errMsg;
    }
}
