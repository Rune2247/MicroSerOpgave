package dk.eaaa.resource;


import dk.eaaa.domain.Advertisement;
import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;

import dk.eaaa.resource.dto.CreateAdvertisementDTO;
import dk.eaaa.resource.dto.UserDTO;
import dk.eaaa.service.response.request.CreateAdvertisementRequest;

import javax.enterprise.context.Dependent;
import java.time.LocalDate;
import java.util.UUID;

@Dependent
public class Mapper {

    //ADVERTISEMENT

    CreateAdvertisementRequest createAdvertisement(CreateAdvertisementDTO advertisementDTO){
        return new CreateAdvertisementRequest(
                advertisementDTO.getCategory(),
                advertisementDTO.getType(),
                advertisementDTO.getHeadline(),
                advertisementDTO.getText(),
                advertisementDTO.getPrice(),
               toId(advertisementDTO.getUser()));
    }


    //USER

    UserDTO toUserDTO(User user) {
        return new UserDTO(user.getId().getRaw(),user.getFirstName(),
                user.getLastName(),
                user.getCompanyName(),
                user.getPhoneNumber(),
                user.getPhoneCode(),user.getEmail(),user.getCityFK(),user.getType());
    }

    Id toId(String id){
        return new Id(id);
    }

    UUID newUUID(){
        return UUID.randomUUID();
    }


}
