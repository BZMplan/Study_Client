import java.sql.*;

public class getMsg {
    public getMsg(){
       Connection con;
       String driver = "com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://47.99.98.126/Java";
       String user = "root";
       String pass = "Eothkl123@";
       
       try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if(!con.isClosed()){
                System.out.println("成功连接至数据库");
            }

            Statement statement = con.createStatement();
            String sql = "select msg from msg";
            ResultSet rs = statement.executeQuery(sql);

            System.out.println("信息为");

            String msg = null;

            while(rs.next()){
                msg = rs.getString("msg");
                System.out.println(msg);
            }
            rs.close();
            con.close();
       } catch (Exception e) {
           System.out.println("连接数据库时发生错误");
       }finally{
           System.out.println("信息获取成功");
       }
    }
}
