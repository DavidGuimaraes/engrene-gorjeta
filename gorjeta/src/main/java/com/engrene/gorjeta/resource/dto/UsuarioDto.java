package com.engrene.gorjeta.resource.dto;

import com.engrene.gorjeta.model.Permissao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {

    private Long id;
    private String nome;
    private String email;
    // TODO - Alterar de Permissao para PermissaoDto e resolver o problema do retorno nulo no id
    private List<Permissao> permissoes;
}
