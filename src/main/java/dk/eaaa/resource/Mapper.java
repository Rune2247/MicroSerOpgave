package dk.eaaa.resource;


import dk.eaaa.domain.Advertisement;
import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;

import dk.eaaa.resource.dto.*;
import dk.eaaa.service.response.request.CreateAdvertisementRequest;
import dk.eaaa.service.response.request.CreateUserRequest;

import javax.enterprise.context.Dependent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

   AdvertisementDTO toAdvertisementDTO(Advertisement advertisement){
        return new AdvertisementDTO(advertisement.getId().getRaw(),advertisement.getCategory(), advertisement.getType(),
                advertisement.getHeadline(),advertisement.getText(),advertisement.getPrice(),advertisement.getUser().getRaw()
                ,advertisement.getCreationDate());
    }

    ArrayList<AdvertisementDTO> toAdvertisementDTOList(List<Advertisement> advertisements){
        ArrayList<AdvertisementDTO> dtos = new ArrayList<>();
        for (Advertisement a: advertisements) {
            AdvertisementDTO ny = new AdvertisementDTO(a.getId().getRaw(),a.getCategory(),a.getType(),
                    a.getHeadline(),a.getText(),a.getPrice(),a.getUser().getRaw(),a.getCreationDate());
            dtos.add(ny);

        }
        return dtos;
    }



    AdvertisementDTO toAdvertisementDTOForId(List<Advertisement> advertisements, String id){

        for (Advertisement a: advertisements) {
            if (a.getId().getRaw().equals(id)){
                AdvertisementDTO ny = new AdvertisementDTO(a.getId().getRaw(),a.getCategory(),a.getType(),
                        a.getHeadline(),a.getText(),a.getPrice(),a.getUser().getRaw(),a.getCreationDate());
                return ny;}

        }
        return null;
    }


    //USER
    CreateUserRequest fromCreateUser(CreateUserDTO createUserDTO){
        return new CreateUserRequest(createUserDTO.getFirstName(),
                createUserDTO.getLastName(),createUserDTO.getCompanyName(),
                createUserDTO.getPhoneNumber(),createUserDTO.getPhoneCode(),
                createUserDTO.getEmail(),createUserDTO.getZipcode(),
                createUserDTO.getType());
    }


    UserDTO toUserDTO(User user) {
        return new UserDTO(user.getId().getRaw(),user.getFirstName(),
                user.getLastName(),
                user.getCompanyName(),
                user.getPhoneNumber(),
                user.getPhoneCode(),user.getEmail(),user.getCity().getZipcode(),user.getCity().getCity(),user.getType());
    }
    // Category
    ArrayList<AdvertisementDTO> toAdvertisementDTOCategoryList(List<Advertisement> advertisements, String category){
        ArrayList<AdvertisementDTO> dtos = new ArrayList<>();
        for (Advertisement a: advertisements) {
            if (a.getCategory().equals(category)){
                AdvertisementDTO ny = new AdvertisementDTO(a.getId().getRaw(),a.getCategory(),a.getType(),
                        a.getHeadline(),a.getText(),a.getPrice(),a.getUser().getRaw(),a.getCreationDate());
                dtos.add(ny);}

        }
        return dtos;
    }




    ArrayList<CategoryDTO> toCategoryDTOList(List<Advertisement> advertisements){
        ArrayList<CategoryDTO> dtos = new ArrayList<>();
        for (Advertisement a: advertisements) {
           CategoryDTO newCategory = new CategoryDTO(a.getCategory(),a.getType());
           dtos.add(newCategory);
        }
        return dtos;
    }
    ArrayList<CategoryDTO> toCategoryWithCount(List<Advertisement> advertisements){

        boolean isSet = false;
        ArrayList<CategoryDTO> dtos = new ArrayList<>();
        for (Advertisement a: advertisements) {
            for (CategoryDTO c: dtos){

                if(c.getCategory().equals(a.getCategory())){
                    c.setCount(c.getCount()+1);
                    isSet = true;
                }

            }

            if (isSet == false){
                CategoryDTO newCategory = new CategoryDTO(a.getCategory(),a.getType(), 1);
                dtos.add(newCategory);


            } else{
                isSet= false;
            }

        }

        return dtos;
    }


    Id toId(String id){
        return new Id(id);
    }

    UUID newUUID(){
        return UUID.randomUUID();
    }


}
