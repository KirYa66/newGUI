public class QuizCard {
    private String question;
    private String answer;

    QuizCard(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    String getQuestion() {
        return this.question;
    }
    String getAnswer() {
        return this.answer;
    }
}
