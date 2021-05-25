package dk.eaaa.repository;


import dk.eaaa.domain.Advertisement;
import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;
import dk.eaaa.repository.entity.AdvertisementPO;
import dk.eaaa.repository.entity.UserPO;

import javax.enterprise.context.Dependent;

@Dependent
class Mapper {

    User mapUser(UserPO userPO) {
        User newUser = new User(new Id(userPO.getId()),
                userPO.getFirstName(),
                userPO.getLastName(),
                userPO.getCompanyName(),
                userPO.getPhoneNumber(),
                userPO.getPhoneCode(),
                userPO.getEmail(),
                userPO.getCityFK(),
                userPO.getType(),
                userPO.getCreated());
        return newUser;
    }

    Advertisement mapAdvertisement(AdvertisementPO advertisementPO){
        return new Advertisement(new Id(advertisementPO.getId()), advertisementPO.getCategory(),advertisementPO.getType()
        ,advertisementPO.getHeadline(),advertisementPO.getText(),advertisementPO.getPrice(),new Id(advertisementPO.getUser_FK()),advertisementPO.getCreationDate());
    }

}
