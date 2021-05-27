package dk.eaaa.repository;


import dk.eaaa.domain.Advertisement;
import dk.eaaa.domain.City;
import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;
import dk.eaaa.repository.entity.AdvertisementPO;
import dk.eaaa.repository.entity.UserPO;

import javax.enterprise.context.Dependent;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
class Mapper {
    //USER
    User mapUser(UserPO userPO) {
        return new User(new Id(userPO.getId()),
                userPO.getFirstName(),
                userPO.getLastName(),
                userPO.getCompanyName(),
                userPO.getPhoneNumber(),
                userPO.getPhoneCode(),
                userPO.getEmail(),
                new City(userPO.getCity().getZipcode(), userPO.getCity().getCity()),
                userPO.getType(),
                userPO.getCreated());
    }

//ADVERTISEMENT

    List<Advertisement> mapAdvertisements(List<AdvertisementPO> listPo) {
        if (listPo == null || listPo.isEmpty()) {
            return Collections.emptyList();
        }
        return listPo.stream().map(this::mapAdvertisement).collect(Collectors.toList());
    }


    Advertisement mapAdvertisement(AdvertisementPO advertisementPO) {
        return new Advertisement(new Id(advertisementPO.getId()), advertisementPO.getCategory(), advertisementPO.getType()
                , advertisementPO.getHeadline(), advertisementPO.getText(), advertisementPO.getPrice(), new Id(advertisementPO.getUser().getId()), advertisementPO.getCreationDate());
    }

}
