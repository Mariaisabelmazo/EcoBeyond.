package backend;
import java.sql.*;

/**
 *Métodos para validar al usuario
 *
 */
public class Acceso {
    baseDatos db = new baseDatos();
    String sql = "";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Acceso(){
        
    }
    
    /**
     * 
     * @param usuario Este Parametro hace posible la validacion del usuario que ya está registrado
     * @param contra Este Parametro hace posible la validacion de la contraseña del usuario que ya está registrado
     * @return retorna los datos
     */
    public int validar(String usuario, String contra){
        int cargo = 0;
        try{
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "select idcargo from usuario where nombre='"+usuario+"' and contraseña='"+contra+"'";
            pst = con.prepareStatement(sql);
            //El cargo de la persona estaría en esta variable rs
            rs = pst.executeQuery();
            while(rs.next()){
                cargo = rs.getInt(1);
            }
            con.close();
            rs.close();
            return cargo;
        }catch(SQLException | ClassNotFoundException e){
            return cargo;
        }
    }
}
