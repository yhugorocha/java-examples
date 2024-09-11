package exercicio;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Conta {

    private Long id;
    private int numero;
    private Double saldo;

}
