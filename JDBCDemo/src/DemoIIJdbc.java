import java.sql.*;

public class DemoIIJdbc {
    public static void main(String[] args) throws Exception {
        /*
            import pacakge
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "password";
        String query = "delete from student where sid = 1 ";
//        String query = "update student set name='Mark' where sid = 3 ";
//        String query = "insert into student values (4, 'Jude', 60)";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established!!!");
        Statement st = con.createStatement();
        st.execute(query);

        con.close();
        System.out.println("Connection closed!!!");
    }
}
