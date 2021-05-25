package dk.eaaa.resource;

import dk.eaaa.domain.Advertisement;
import dk.eaaa.resource.dto.CreateAdvertisementDTO;
import dk.eaaa.service.response.AdvertisementService;
import dk.eaaa.service.response.request.CreateAdvertisementRequest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/advertisements")
public class AdvertisementResource {
    private final AdvertisementService advertisementService;
    private final Mapper mapper;

    @Inject
    public AdvertisementResource(AdvertisementService advertisementService, Mapper mapper) {
        this.advertisementService = advertisementService;
        this.mapper = mapper;
    }


    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    @POST
    public void createAdvertisement(CreateAdvertisementDTO advertisementDTO){
    advertisementService.createAdvertisement(mapper.createAdvertisement(advertisementDTO));
    }

}
