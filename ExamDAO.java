import java.sql.*;

public class ExamDAO {

    public ResultSet getAllQuestions() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        return st.executeQuery("SELECT * FROM questions");
    }

    public void saveStudentResult(int studentId, int score) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps =
            con.prepareStatement("INSERT INTO results VALUES (?, ?)");
        ps.setInt(1, studentId);
        ps.setInt(2, score);
        ps.executeUpdate();
    }
}
