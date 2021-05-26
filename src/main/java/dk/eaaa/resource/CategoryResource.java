package dk.eaaa.resource;

import dk.eaaa.domain.Advertisement;
import dk.eaaa.resource.dto.AdvertisementDTO;
import dk.eaaa.resource.dto.CategoryDTO;
import dk.eaaa.resource.dto.CreateAdvertisementDTO;
import dk.eaaa.service.response.AdvertisementService;
import dk.eaaa.service.response.request.CreateAdvertisementRequest;

import javax.inject.Inject;
import javax.ws.rs.*;
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
        public List<CategoryDTO> getAllAdvertisementsCategory(){
            return mapper.toCategoryDTOList(advertisementService.getAllAdvatisements());
        }
        @Produces(MediaType.APPLICATION_JSON)
        @Path("/count")
        @GET
        public List<CategoryDTO> getAllAdvertisementsWithCount(){

                return mapper.toCategoryWithCount(advertisementService.getAllAdvatisements());

    }
    }

