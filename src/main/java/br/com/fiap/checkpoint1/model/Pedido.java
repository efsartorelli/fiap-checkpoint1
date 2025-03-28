package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do cliente é obrigatório")
    private String clienteNome;

    private LocalDate dataPedido = LocalDate.now();

    @PositiveOrZero (message = "Valor não pode ser negativo")
    private double valorTotal;
}