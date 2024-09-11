package exercicio;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Usuario {
    private Long id;
    private String nome;
    private String login;
    private String email;
    private String senha;
    private Conta conta;

}
