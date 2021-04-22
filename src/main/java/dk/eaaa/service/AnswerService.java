package dk.eaaa.service;


import dk.eaaa.domain.Explanation;
import dk.eaaa.domain.Question;
import dk.eaaa.repository.Repository;
import dk.eaaa.resource.dto.AnswerDTO;
import dk.eaaa.resource.dto.AnswerResponseDTO;
import dk.eaaa.resource.dto.ExplanationDTO;
import dk.eaaa.service.response.AnswerResponse;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class AnswerService implements Service {
// Denne klasse skal fungere som en "Controller" til repository laget.

    private Repository repository;

    @Inject
    public AnswerService(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<Question> getQuestion() {
        return repository.getQuestionList();
    }



    // denne metode skal fine ud af om svar er correct
    public AnswerResponse answerQuestion(int questionID, int AnswerID){

    //Kør alle spørgsmål igennem
        for (int i = 0; i <repository.getQuestionList().size() ; i++) {
            //Find det rigtige spørgsmål
            if (questionID == repository.getQuestionList().get(i).getId()){
                Question q = repository.getQuestionList().get(i);
                Explanation explanation = repository.getExplanationList().get(i);

                //køre alle answeres igennem
                for (int j = 0; j < q.getAnswers().size(); j++) {

                    //Kigger om spørgsmål indeholder answerid
                    if (AnswerID == q.getAnswers().get(j).getId()){
                        AnswerResponse answerResponse = new AnswerResponse(explanation,false);

                        //kig om den er korrekt, hvis ikke forbliver den på false
                        if (q.getAnswers().get(j).isCorrect() == true){

                            answerResponse.setCorrectAnswer(true);
                        }
                        return answerResponse;
                    }
                }


            }
        }


        return null;

    }



}

