package com.engrene.gorjeta.resource.mapper;

import com.engrene.gorjeta.model.Usuario;
import com.engrene.gorjeta.resource.dto.UsuarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mappings({
            @Mapping(target = "id", source = "idUsuario")
    })
    UsuarioDto entityToDto(Usuario usuario);

    List<UsuarioDto> entityToDto(List<Usuario> usuario);

    @Mappings({
            @Mapping(target = "idUsuario", source = "id")
    })
    Usuario dtoToEntity(UsuarioDto usuarioDto);

    List<Usuario> dtoToEntity(List<UsuarioDto> usuarioDto);
}
