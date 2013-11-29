package Datos;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class MiSql {
    public Driver objDriver;
    public DriverManager objDriverManager;
    public Connection objConnection;
    public String IP="192.168.150.5",BD="productos",usuario="antonio",clave="123456";
    public MiSql(){
       try{
           objDriver=(Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
           DriverManager.registerDriver(objDriver);
           objConnection=DriverManager.getConnection("jdbc:mysql://"+IP+"/"+BD,usuario,clave);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"\nError de Conexion Remota:\n "+e.toString());
        }
    }

    public Connection getConnection(){
       return objConnection;
    }
}