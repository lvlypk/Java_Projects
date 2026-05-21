package Java_Projects.Project1;
import java.util.Scanner;
public class QuestionService {
    String[] StudAns=new String[5];
    Scanner s=new Scanner(System.in);
    Questions[] q=new Questions[5];
    String[] opt1={"function","define","class","object"};
    String[] opt2={"start()","run()","main()","init()"};
    String[] opt3={"echo()","print()","System.out.println()","console.log()"};
    String[] opt4={"float","int","char","boolean"};
    String[] opt5={"=","==",":=","!=>"};
    public void QuesService(){
    q[0]=new Questions(1,"Which keyword is used to create a class in Java",opt1,"class");
    q[1]=new Questions(2,"Which method is the entry point of a Java program?",opt2,"main()");
    q[2]=new Questions(3,"Which of the following is used to print output in Java?",opt3,"System.out.println()");
    q[3]=new Questions(4,"Which data type is used to store whole numbers in Java?",opt4,"int");
    q[4]=new Questions(5,"Which operator is used for comparison in Java?",opt5,"==");
    }
    public void DisplayQuestion(){
        for (int i=0;i<q.length;i++){
        System.out.println(q[i].getId());
        System.out.println(q[i].getQuestions());

        for(String op : q[i].getOptions()) {
            System.out.println(op);
        }

        //String ActualAns=q[i].getAnswers();
        System.out.print("Enter the Answer : ");
        StudAns[i]=s.nextLine();

        }
    }
    public void Score(){
        int score=0;
        for(int i=0;i<q.length;i++){
           // Questions que=q[i];
        String ActualAns=q[i].getAnswers();
        String EnterAns=StudAns[i];
        if(ActualAns.equals(EnterAns)){
            score++;
        }

        }
        System.out.println("My Score is : "+score);
    }
}


