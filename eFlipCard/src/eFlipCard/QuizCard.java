package eFlipCard;

public class QuizCard {
	
	private String question;
	private String answer;

	
	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public QuizCard(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
}
