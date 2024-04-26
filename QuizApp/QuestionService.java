package QuizApp;

import java.util.Scanner;

public class QuestionService {
	Question[] questions = new Question[5];
	String userAnswers[] = new String[5];

	public QuestionService() {
		questions[0] = new Question(1, "What year was Java created?", "1995", "2011", "1999", "2000", "1995");
		questions[1] = new Question(2, "Who is the original developer of Java?", "James Gosling", "Bill Gates",
				"Larry Page", "Steve Jobs", "James Gosling");
		questions[2] = new Question(3, "What is the JVM?", "Java Virtual Machine", "Java Virtual Memory",
				"Java Virtual Manager", "Java Virtual Method", "Java Virtual Machine");
		questions[3] = new Question(4, "Which keyword is used to define a constant in Java?", "final", "const", "static",
				"volatile", "final");
		questions[4] = new Question(5, "What does OOP stand for?", "Object-Oriented Programming", "Object-Oriented Process",
				"Object-Oriented Protocol", "Object-Oriented Project", "Object-Oriented Programming");
	}

	public void displayQuestions() {
		for (Question q : questions) {
			System.out.println(q.getAnswer());
		}
	}

	public void playQuiz() {
		int i = 0;

		for (Question q : questions) {
			System.out.println("Question no. : " + q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());

			Scanner sc = new Scanner(System.in);
			userAnswers[i++] = sc.nextLine();

			for (String s : userAnswers) {
				System.out.println(s);
			}

		}
	}

	public void printScore() {
		int score = 0;

		for (int i = 0; i < questions.length; i++) {
			Question que = questions[i];
			String answer = que.getAnswer();
			String userChoice = userAnswers[i];

			if (answer.equals(userChoice)) {
				score++;
			}
		}

		System.out.println("Your scroe is : " + score + "out of " + questions.length);
	}
}
