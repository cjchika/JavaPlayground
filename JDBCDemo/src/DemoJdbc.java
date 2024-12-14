import java.sql.*;

public class DemoJdbc {
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
        String pass = "224568";
        String query = "select * from student";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established!!!");
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(query);
//        rs.next();
//        String name = rs.getString("name");
//        System.out.println(name);

//        System.out.println(rs.next());

        while(rs.next()){
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("Connection closed!!!");


    }
}
