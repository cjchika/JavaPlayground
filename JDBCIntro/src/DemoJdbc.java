import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        int sid = 1;
        String sname = "Karl";
        int marks = 50;

        String url = "jdbc:postgresql://localhost:5432/demo01";
        String uname = "postgres";
        String pass = "224568";
//        String query = "select sname from student where sid = 1";
//        String query = "select * from student";
//        String query = "insert into student values (4, 'Jewel', 54)";
//        String query = "update student set sname='Milan' where sid=3";
//        String query = "delete from student where sid=1";
        String query = "insert into student values (?,?,?)";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected!!!");
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);

        st.execute();
        
//        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery(query);

//        res.next();
//        String name = res.getString("sname");
//        System.out.println("Got name: "+ name);

//        while (res.next()){
//            System.out.print(res.getInt(1) + " - ");
//            System.out.print(res.getString(2) + " - ");
//            System.out.println(res.getInt(3));
//        }

//        boolean status = st.execute(query);
//        System.out.println(status);

        con.close();
        System.out.println("Connection closed!!!");

    }
}
