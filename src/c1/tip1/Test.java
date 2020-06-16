/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: effective_java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/6/30 1.0          guchaolong          Creation File
 */
package c1.tip1;

import java.sql.*;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/6/30 8:01
 */
public class Test {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db1";
            String userName = "root";
            String password = "root";
            Class.forName("com.mysql.jdbc.Driver") ;
            //优点5：使用静态工厂方法代替构造器，返回对象的类不需要存在，Coolection,PreparedStatement都是接口
            Connection conn = DriverManager.getConnection(url, userName, password);
            PreparedStatement sql = conn.prepareStatement("select * from fenshu;");
            ResultSet resultSet = sql.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                System.out.println(name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }


    }

}