package br.com.softplan.feature.usuario.model;

import br.com.softplan.core.model.AbstractEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Usuario extends AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate aniversario;
    private String endereco;
    private boolean ativo;
    private String login;
    private String senha;
    @Enumerated(value = EnumType.STRING)
    private PerfilUsuario perfil;

}
