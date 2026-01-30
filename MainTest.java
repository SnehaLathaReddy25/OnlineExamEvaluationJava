public class MainTest {

    public static void main(String[] args) {
        try {
            ExamService service = new ExamService();
            ExamDAO dao = new ExamDAO();

            int score = service.evaluateExam();
            dao.saveResult(1, score);

            System.out.println("Exam completed. Score = " + score);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
