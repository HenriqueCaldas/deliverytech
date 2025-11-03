package com.deliverytech.delivery_api.dto.response;

//import com.deliverytech.delivery_api.model.Usuario;

import lombok.Data;

@Data
public class UserResponse {
    private String message;
    private String email;
    private String nome;
    private String role;
    
    // Método temporário até implementar corretamente
    public static UserResponse fromEntity(Object usuario) {
       // Usuario user = (Usuario) usuario;
        UserResponse response = new UserResponse();
        response.setMessage("Usuário criado com sucesso");
        //response.setEmail(usuario.getEmail());
        //response.setNome(usuario.getNome());
        //response.setRole(usuario.getRole().toString());
        return response;
    }
}
