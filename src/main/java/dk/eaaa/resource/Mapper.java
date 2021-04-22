package dk.eaaa.resource;


import dk.eaaa.domain.Answer;
import dk.eaaa.domain.Explanation;
import dk.eaaa.domain.Question;
import dk.eaaa.resource.dto.AnswerDTO;
import dk.eaaa.resource.dto.AnswerResponseDTO;
import dk.eaaa.resource.dto.QuestionDTO;
import dk.eaaa.resource.dto.ExplanationDTO;
import dk.eaaa.service.response.AnswerResponse;


import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class Mapper {

    // laver Question om til QuestionDTO

public QuestionDTO toQuestionDTO(Question question){
    int  id = question.getId();
    String category = question.getCategory();
    String field = question.getField();
    int points = question.getPoints();
    String newQuestion = question.getQuestion();


   List<AnswerDTO> answers = toAnswerDTO(question.getAnswers());
    
    return new QuestionDTO( id, category, field, points, newQuestion, answers);
}


public List<AnswerDTO> toAnswerDTO(List<Answer> answerList){

    List<AnswerDTO> answerDTOList = new ArrayList<>();

    for (int i = 0; i < answerList.size(); i++) {
        answerDTOList.add(new AnswerDTO(answerList.get(i).getId(), answerList.get(i).getAnswer()));
    }


    return answerDTOList;
}




public ExplanationDTO mapExplanation(Explanation explanation){
return (new ExplanationDTO(explanation.getExplanation(),explanation.getSourceUrl()));
}

public String getAnwseresJSON(Question question){
    // lav en liste af answers fra et question om til Json
  List<Answer> answers = question.getAnswers();


return "";
}

public AnswerResponseDTO fromAnswerResponseToDTO(AnswerResponse answerResponse){
    return  new AnswerResponseDTO(mapExplanation(answerResponse.getExplanation()),answerResponse.isCorrectAnswer());
}

}
