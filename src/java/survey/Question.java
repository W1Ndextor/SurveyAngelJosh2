package survey;
// Generated Feb 23, 2017 6:28:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Question generated by hbm2java
 */
public class Question  implements java.io.Serializable {


     private int questionId;
     private int surveyID;
     private Survey survey;
     private String questionText;
     private Set<Response> responses = new HashSet<Response>(0);

    public Question() {
    }

	
    public Question(String questionText, int surveyID) {
        this.questionId = questionId;
        this.surveyID = surveyID;
        this.questionText = questionText;
    }
    public Question(String questionText, int surveyID, Set<Response> responses) {
       this.questionId = questionId;
       this.surveyID = surveyID;
       this.questionText = questionText;
       this.responses = responses;
    }
   
    public int getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
    public Survey getSurvey() {
        return this.survey;
    }
    
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
    public String getQuestionText() {
        return this.questionText;
    }
    
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public Set<Response> getResponses() {
        return this.responses;
    }
    
    public void setResponses(Set<Response> responses) {
        this.responses = responses;
    }




}
