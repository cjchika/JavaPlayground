package quiz;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[4];
    String[] selection = new String[4];

    public QuestionService(){
        questions[0] = new Question(1, "Who created Java", "John", "Michael", "Jude", "Philip", "1");
        questions[1] = new Question(2, "Who created JavaScript", "John", "Michael", "Jude", "Philip", "2");
        questions[2] = new Question(3, "Who created PHP", "John", "Michael", "Jude", "Philip", "3");
        questions[3] = new Question(2, "Who created Python", "John", "Michael", "Jude", "Philip", "4");
    }

    public void playQuiz(){
        int i = 0;

        for(Question question : questions){
            System.out.println("Question no. : " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score = 0;

        for (int i =0; i < questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
