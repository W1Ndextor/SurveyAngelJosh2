package survey;
// Generated Feb 23, 2017 6:28:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SurveyRespondent generated by hbm2java
 */
public class SurveyRespondent  implements java.io.Serializable {


     private int surveyRespondentId;
     private Respondent respondent;
     private Survey survey;
     private Set<Response> responses = new HashSet<Response>(0);

    public SurveyRespondent() {
    }

	
    public SurveyRespondent(int surveyRespondentId, Respondent respondent, Survey survey) {
        this.surveyRespondentId = surveyRespondentId;
        this.respondent = respondent;
        this.survey = survey;
    }
    public SurveyRespondent(int surveyRespondentId, Respondent respondent, Survey survey, Set<Response> responses) {
       this.surveyRespondentId = surveyRespondentId;
       this.respondent = respondent;
       this.survey = survey;
       this.responses = responses;
    }
   
    public int getSurveyRespondentId() {
        return this.surveyRespondentId;
    }
    
    public void setSurveyRespondentId(int surveyRespondentId) {
        this.surveyRespondentId = surveyRespondentId;
    }
    public Respondent getRespondent() {
        return this.respondent;
    }
    
    public void setRespondent(Respondent respondent) {
        this.respondent = respondent;
    }
    public Survey getSurvey() {
        return this.survey;
    }
    
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
    public Set<Response> getResponses() {
        return this.responses;
    }
    
    public void setResponses(Set<Response> responses) {
        this.responses = responses;
    }




}


