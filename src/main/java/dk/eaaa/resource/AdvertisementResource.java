package dk.eaaa.resource;

import dk.eaaa.resource.dto.AdvertisementDTO;
import dk.eaaa.resource.dto.CreateAdvertisementDTO;
import dk.eaaa.service.response.AdvertisementService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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
    public void createAdvertisement(CreateAdvertisementDTO advertisementDTO) {
        advertisementService.createAdvertisement(mapper.createAdvertisement(advertisementDTO));
    }

    //http://host:port/advertisements med query param ?category=<caterory>
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    @GET
    public List<AdvertisementDTO> getAllAdvertisements() {
        return mapper.toAdvertisementDTOList(advertisementService.getAllAdvatisements());
    }

    // get all post with given category
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/find/{category}")
    @GET
    public List<AdvertisementDTO> getAllAdvertisements(@PathParam("category") String category) {
        return mapper.toAdvertisementDTOCategoryList(advertisementService.getAllAdvatisements(), category);
    }

    //http://host:port/advertisements/{id} der returnerer en specific advertisment
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    @GET
    public AdvertisementDTO getAdvertisementsForId(@PathParam("id") String Id) {
        return mapper.toAdvertisementDTOForId(advertisementService.getAllAdvatisements(), Id);
    }
}
