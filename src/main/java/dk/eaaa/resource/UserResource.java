package dk.eaaa.resource;

import dk.eaaa.domain.Id;
import dk.eaaa.resource.dto.UserDTO;
import dk.eaaa.service.response.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserResource {
    private final UserService userService;
    private final Mapper mapper;

    @Inject
    public UserResource(UserService userService, Mapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    @GET
    public UserDTO GetUser(@PathParam("id") String id) {
        return mapper.toUserDTO(userService.getUserById(new Id(id)));
    }

}



