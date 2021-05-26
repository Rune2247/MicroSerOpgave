package dk.eaaa.service.response;

import dk.eaaa.domain.Advertisement;
import dk.eaaa.repository.Repository;
import dk.eaaa.service.response.request.CreateAdvertisementRequest;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Dependent
@Transactional(rollbackOn = Exception.class)
public class AdvertisementService {
    private final Repository repository;

    @Inject
    public AdvertisementService(Repository repository) {
        this.repository = repository;
    }


    public void createAdvertisement(CreateAdvertisementRequest advertisement){
        repository.createAdvertisement(advertisement);
    }

    public List<Advertisement> getAllAdvatisements(){
        return repository.getAllAdvertisements();
    }
}
