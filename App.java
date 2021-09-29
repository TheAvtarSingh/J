import java.sql.*; //Step 1



public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //Step 2 : Load and register the database driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/ewa";
    String username = "root";
    String Password = "Avtar@123";
    //Step 3 : Establishing the database connection
    Connection con = DriverManager.getConnection(url,username,Password);

    if(con!=null){
        System.out.println("Connection Established !");

    }
    //Step 4 : Create and execute SQL Statements/queries
    String query = "select address from citizen where id = 100 ";

    Statement stmt = con.createStatement();

    // Step 5 : Process the result

    ResultSet result = stmt.executeQuery(query);
    result.next();
    String name = result.getString("address");

    

    System.out.println("Result fetched is : "+name);

    //Close the database
    con.close();
    }
}
