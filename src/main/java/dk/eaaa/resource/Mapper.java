package dk.eaaa.resource;


import dk.eaaa.domain.User;
import dk.eaaa.resource.dto.UserDTO;

import javax.enterprise.context.Dependent;

@Dependent
public class Mapper {

    UserDTO toUserDTO(User user) {
        return new UserDTO(user.getId().getRaw(),user.getFirstName(),
                user.getLastName(),
                user.getCompanyName(),
                user.getPhoneNumber(),
                user.getPhoneCode(),user.getEmail(),user.getCityFK(),user.getType());
    }
}
