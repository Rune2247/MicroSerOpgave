package dk.eaaa.service.response;

import dk.eaaa.domain.Advertisement;
import dk.eaaa.repository.Repository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class AdvertisementService {
    private final Repository repository;

    @Inject
    public AdvertisementService(Repository repository) {
        this.repository = repository;
    }
    public void createAdvertisement(Advertisement advertisement){
        repository.createAdvertisement(advertisement);
    }
}
