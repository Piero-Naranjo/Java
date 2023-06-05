import java.sql.*;

public class Conection {

    private static final String usuario = "postgres";
    private static final String clave = "12345";//(editar de acuerdo tu contraseña del postgre)
    private static Connection connection;

    public static void iniciarCon(){
        try{
            connection = DriverManager.getConnection(""+"jdbc:postgresql://localhost:5432/users",usuario,clave);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addUsuarios(String name,String lastname,String username,Integer password){

        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO users(name,lastname,username,password)VALUES(?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,lastname);
            ps.setString(3,username);
            ps.setInt(4,password);
            System.out.println("Se ah añadido un nuevo usuario");

            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void muestraUsuarios() {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM users ORDER BY id");
            ResultSet resultado = ps.executeQuery();
            System.out.printf("%-5s %-15s %-15s %-15s %-15s%n", "id", "nombre", "apellido", "usuario", "contraseña");
            while (resultado.next()) {
                long id = resultado.getLong("id");
                String nombre = resultado.getString("name");
                String apellido = resultado.getString("lastname");
                String usuario = resultado.getString("username");
                Integer contraseña = resultado.getInt("password");

                System.out.printf("%-5d %-15s %-15s %-15s %-15d%n", id, nombre, apellido, usuario, contraseña);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateUsuarios(long id,String newName,String newLname,String newUsuario,Integer newContra){
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE users SET name = ?, lastname = ?,username = ?, password = ? WHERE id = ?");
            ps.setString(1,newName);
            ps.setString(2,newLname);
            ps.setString(3,newUsuario);
            ps.setInt(4,newContra);
            ps.setLong(5,id);
            int gor = ps.executeUpdate();

            if(gor == 0){
                System.out.println("El usuario no ah podido ser modificado");
            }else{
                System.out.println("El usuario ah sido actualizado");
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    
    
    public static void deleteUsuario(long id){

        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            ps.setLong(1,id);
            int gor = ps.executeUpdate();

            if(gor==0){
                System.out.println("EL usuario no ah sido eliminado");
            }else{
                System.out.println("EL usuario ah sido eliminado");

                PreparedStatement selectStmt = connection.prepareStatement("SELECT * FROM users WHERE id > ?");
                selectStmt.setLong(1, id);
                ResultSet resultSet = selectStmt.executeQuery();

                PreparedStatement updateStmt = connection.prepareStatement("UPDATE users SET id = ? WHERE id = ?");
                while (resultSet.next()) {
                    long anteriorId = resultSet.getLong("id");
                    long nuevoId = anteriorId - 1;
                    updateStmt.setLong(1, nuevoId);
                    updateStmt.setLong(2, anteriorId);
                    updateStmt.executeUpdate();
                }
                selectStmt.close();updateStmt.close();resultSet.close();
            }
        }catch(SQLException throwables){throwables.printStackTrace();
        }
    }
}
