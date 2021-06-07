
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
public class JdbcSQLExceptionToDeclare {
    public static void main(String[] args) throws SQLException {
        var url = "jdbc:mysql://localhost:3306/ocp";
        var user = "root";
        var password = "password";
        var list = new ArrayList<Integer>();
 
        try (var con = DriverManager.getConnection(url, user, password);
             var stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery("Select ID from LOG");
                while(rs.next()) {
                    list.add(rs.getInt("ID"));
                }
        }
        System.out.println(list.size());
    }
}
// SQLException must be declared
