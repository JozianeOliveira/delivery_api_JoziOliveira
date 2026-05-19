package com.deliverytech.delivery_api_JoziOliveira.dto;

import com.deliverytech.delivery_api_JoziOliveira.enums.StatusPedido;
import jakarta.validation.constraints.NotNull;

public class StatusPedidoDTO {

    @NotNull(message = "Status é obrigatório")
    private StatusPedido status;

    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }
}