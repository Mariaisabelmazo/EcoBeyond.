package backend;

/**
 * El objetivo de esta clase es centralizar las credenciales de conexión a la base de datos
 * 
 */
public class baseDatos {
    
    /**
     * Credenciales de conexión
     */
    private String url;
    private String user;
    private String contra;
    private String driver;
    
    public baseDatos() {
        this.url = "jdbc:mysql://localhost:3306/dbEcoBeyond";
        this.user = "root";
        this.contra = "";
        this.driver = "com.mysql.jdbc.Driver";
    }

    /**
     * Devuelve la url de la base de datos
     * @return 
     */
    public String getUrl() {
        return url;
    }

    /**
     * Devuelve el user de mysql
     * @return 
     */
    public String getUser() {
        return user;
    }

    /**
     * Devuelve la contraseña del usuario mysql
     * @return 
     */
    public String getContra() {
        return contra;
    }

    /**
     * Devuelve el conector que usaremos para la conexión con la base de datos
     * @return 
     */
    public String getDriver() {
        return driver;
    }
}
