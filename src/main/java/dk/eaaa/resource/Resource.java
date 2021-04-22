package dk.eaaa.resource;

import dk.eaaa.domain.Question;
import dk.eaaa.resource.dto.AnswerResponseDTO;
import dk.eaaa.resource.dto.QuestionAnswerDTO;
import dk.eaaa.resource.dto.QuestionDTO;
import dk.eaaa.service.AnswerService;
import dk.eaaa.service.response.AnswerResponse;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


// i denne klasse skal alle vores endpoints ligge

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class Resource {

    private AnswerService service;
    private Mapper mapper;

    @Inject
    public Resource(AnswerService service, Mapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Path("/questions")
    @GET
    public QuestionDTO GetAnswer(){
//Send a random question
        return mapper.toQuestionDTO(service.getQuestion().get(0));
    }

    @Path("/qu/{id}")
    @GET
    public QuestionDTO GetAnswer1(@PathParam("id") int id){
// send a specific question
        return mapper.toQuestionDTO(service.getQuestion().get(id + 1));
    }


    @Path("/questions/{qid}/answer/{aid}")
    @POST
    public AnswerResponse PostAnswer(@PathParam("qid") int qid, @PathParam("aid") int aid) {
    // get question/id

    return service.answerQuestion(qid,aid);


    }
}


