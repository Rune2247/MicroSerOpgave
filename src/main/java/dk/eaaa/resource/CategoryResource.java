package dk.eaaa.resource;


import dk.eaaa.resource.dto.CategoryDTO;
import dk.eaaa.service.response.AdvertisementService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/category")
public class CategoryResource {
    private final AdvertisementService advertisementService;
    private final Mapper mapper;

    @Inject
    public CategoryResource(AdvertisementService advertisementService, Mapper mapper) {
        this.advertisementService = advertisementService;
        this.mapper = mapper;
    }


    //http://host:port/categories Der returnerer alle mulige kategorier
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    @GET
    public List<CategoryDTO> getAllAdvertisementsCategory() {
        return mapper.toCategoryDTOList(advertisementService.getAllAdvatisements());
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Path("/count")
    @GET
    public List<CategoryDTO> getAllAdvertisementsWithCount() {

        return mapper.toCategoryWithCount(advertisementService.getAllAdvatisements());

    }
}

