package dk.eaaa.resource.dto;

public class AnswerResponseDTO {
    private ExplanationDTO explanationDTO;
    private boolean correctAnswer;

    public AnswerResponseDTO(ExplanationDTO explanationDTO, boolean correctAnswer) {
        this.explanationDTO = explanationDTO;
        this.correctAnswer = correctAnswer;
    }
}

