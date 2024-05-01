import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo01";
        String uname = "postgres";
        String pass = "224568";
//        String query = "select sname from student where sid = 1";
        String query = "select * from student";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected!!!");
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

//        res.next();
//        String name = res.getString("sname");
//        System.out.println("Got name: "+ name);

        while (res.next()){
            System.out.print(res.getInt(1) + " - ");
            System.out.print(res.getString(2) + " - ");
            System.out.println(res.getInt(3));
        }

        con.close();
        System.out.println("Connection closed!!!");

    }
}
