package javaxmariadb;

import java.sql.*;

public class JavaxMariaDB {
    // JDBC driver name and database URL

    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/dbqatar2022";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Gondor.22";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            
            //insertar un nuevo empleado
            String query = """
                           INSERT INTO Empleado (dni,nombre,apellido,nacionalidad,departamento)
                           	VALUES(325458,'Marshall','Mathers','Estados Unidos',4);
                           """;
            stmt.executeQuery(query);
            query = "SELECT * FROM Empleado WHERE dni = 325458;";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("Nombre:"+rs.getString(3)+". Apellido:" + rs.getString(4)+". dni:"+rs.getString(2)+". nacionalidad:"+rs.getString(5)+". Departamento:"+rs.getString(6));
                System.out.println("Xd");
            }
            
            //modificar la nacionalidad de un empleado
            query = "UPDATE Empleado SET nacionalidad = 'Estados Unidos' WHERE id = 9;";
            stmt.executeQuery(query);
            query = "SELECT * FROM Empleado WHERE id = 9;";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("Nombre:"+rs.getString(3)+". Apellido:" + rs.getString(4)+". dni:"+rs.getString(2)+". nacionalidad:"+rs.getString(5)+". Departamento:"+rs.getString(6));
            }
            
            
            //Todos los de logistica
            query = """
                    SELECT Empleado.dni,Empleado.nombre,Empleado.apellido,Empleado.nacionalidad,Departamento.nombre as departamento
                    FROM Empleado INNER JOIN Departamento on Empleado.departamento = Departamento.id WHERE Departamento.id = 2;
                    """;
            stmt.executeQuery(query);
            rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("Nombre:"+rs.getString(2)+". Apellido:" + rs.getString(3)+". dni:"+rs.getString(1)+". nacionalidad:"+rs.getString(4)+". Departamento:"+rs.getString(5));
            }
            
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample
