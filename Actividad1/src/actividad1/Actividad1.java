
package actividad1;

import java.sql.*;
public class Actividad1 {

    public static void main(String[] args) {
     // TODO code application logic here
        System.out.println("Iniciando");
        
        // Creando la conexión
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/izv_dawm","izv_dawm","123456"); 
            String sql ="if object_id('AJCOMERCIO') is not null"  
                    + "drop table AJCOMERCIO;"
                    + "GO"
                    + "CREATE TABLE AJCOMERCIO("
                    + "ID_COMERCIO VARHCAR (20),"
                    + "NOMBRE VARCHAR (25),"
                    + "DIRECCION VARCHAR (50),"
                    + "TIPO VARCHAR (50),"
                    + "PRIMARY KEY (ID_COMERCIO))"
                    
                    + "GO"
                    + "CREATE TABLE AJHORARIO("
                    + "ID_HORARIO DATATIME,"
                    + "DIA_SEMANA DATATIME,"
                    + "HORA_INICIO TIME,"
                    + "HORA_FIN TIME,"
                    + "MES_INICIO DATATIME,"
                    + "MES_FIN DATATIME,"
                    + "PRIMARY HEY(ID_HORARIO))";
                    
                    
            Statement stmt = null;
            try {
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    String first = rs.getString("first");
                    String second = rs.getString("second");
                    
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            } finally {
                stmt.close();
                con.close();
            }
           
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch ( Exception e){
            e.printStackTrace();
        }
    }
    
}
 