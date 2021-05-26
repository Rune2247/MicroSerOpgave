package dk.eaaa.repository;

import dk.eaaa.domain.Advertisement;
import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;
import dk.eaaa.repository.entity.AdvertisementPO;
import dk.eaaa.repository.entity.CityPO;
import dk.eaaa.repository.entity.UserPO;
import dk.eaaa.repository.entitymanager.DemoEntityManager;
import dk.eaaa.service.response.request.CreateAdvertisementRequest;
import dk.eaaa.service.response.request.CreateUserRequest;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

@Dependent
public class Repository {

    private final EntityManager entityManager;
    private final Mapper mapper;

    @Inject
    public Repository(DemoEntityManager entityManager, Mapper mapper) {
        this.entityManager = entityManager.getEntityManager();
        this.mapper = mapper;
    }

    // USER
    public User getUser(Id id) {
        return mapper.mapUser(entityManager.find(UserPO.class, id.getId()));
    }

    public void CreateUser(CreateUserRequest user) {
        CityPO cityPO = entityManager.find(CityPO.class,user.getZipcode());

        UserPO newuser =new UserPO(user.getFirstName(), user.getLastName(),
                user.getCompanyName(), user.getPhoneNumber(),
                user.getPhoneCode(), user.getEmail(), cityPO, user.getType());
        entityManager.persist(newuser);

    }

    //ADVERTISEMENT

    public void createAdvertisement(CreateAdvertisementRequest advertisement) {
        UserPO userPO = entityManager.find(UserPO.class, advertisement.getUserFK().getId());

        entityManager.persist(
                new AdvertisementPO(
                        advertisement.getCategory(),
                        advertisement.getType(),
                        advertisement.getHeadline(),
                        advertisement.getText(),
                        advertisement.getPrice(),
                        userPO));
    }

    public Advertisement getAdvertisement(Id id) {
        return mapper.mapAdvertisement(entityManager.find(AdvertisementPO.class, id.getId()));
    }


    public List<Advertisement> getAllAdvertisements() {
        List<AdvertisementPO> list = entityManager.createNamedQuery(AdvertisementPO.FIND_ALL, AdvertisementPO.class).getResultList();
        return mapper.mapAdvertisements(list);
    }


}
