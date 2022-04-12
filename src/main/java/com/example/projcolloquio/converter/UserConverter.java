package com.example.projcolloquio.converter;

import com.example.projcolloquio.data.dto.UserDTO;
import com.example.projcolloquio.data.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {

    public UserDTO convertUserToDto(User user){
        UserDTO dto=new UserDTO();
        dto.setNome(user.getNome());
        dto.setCognome(user.getCognome());
        dto.setEmail(user.getEmail());
        return dto;
    }

}