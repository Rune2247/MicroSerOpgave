package dk.eaaa.resource;

import dk.eaaa.resource.dto.CreateAdvertisementDTO;
import dk.eaaa.service.response.AdvertisementService;
import dk.eaaa.service.response.UserService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/advertisement")
public class AdvertisementResource {
    private final AdvertisementService advertisementService;
    private final Mapper mapper;

    @Inject
    public AdvertisementResource(AdvertisementService advertisementService, Mapper mapper) {
        this.advertisementService = advertisementService;
        this.mapper = mapper;
    }


    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    @POST
    public void createAdvertisement(CreateAdvertisementDTO advertisementDTO){

    }
}
