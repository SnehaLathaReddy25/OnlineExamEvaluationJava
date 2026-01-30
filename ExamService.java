import java.sql.ResultSet;

public class ExamService {

    ExamDAO dao = new ExamDAO();

    public int evaluateExam() throws Exception {
        ResultSet rs = dao.getQuestions();
        int score = 0;

        while (rs.next()) {
            String correct = rs.getString("correct_answer");
            String studentAnswer = correct; // assume correct answer
            if (correct.equals(studentAnswer)) {
                score++;
            }
        }
        return score;
    }
}
