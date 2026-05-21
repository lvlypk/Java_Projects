package Java_Projects.project1;

public class Questions {
private  int id;
private  String Questions;
private  String options[]=new String[4];
private  String answers;
public Questions(int id, String questions, String[] options, String answers) {
    this.id = id;
    Questions = questions;
    this.options = options;
    this.answers = answers;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getQuestions() {
    return Questions;
}
public void setQuestions(String questions) {
    Questions = questions;
}
public String[] getOptions() {
     return options; 
}
public void setOptions(String[] options) {
    this.options = options;
}
public String getAnswers() {
    return answers;
}
public void setAnswers(String answers) {
    this.answers = answers;
} 
}
