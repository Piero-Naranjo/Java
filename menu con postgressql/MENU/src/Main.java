import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Conection.iniciarCon();

        int opc;

        do{
            System.out.println("\n<1> Visualizar usuarios");
            System.out.println("<2> Agregar usuarios");
            System.out.println("<3> Editar usuario");
            System.out.println("<4> Borrar usuarios");
            System.out.println("<0> Salir");
            System.out.print("Elija una opción: ");
            opc = scanner.nextInt();


            if(opc == 1){
                visualizarUsuarios();
            }else if(opc==2){
                addUsuario();
            }else if(opc==3){
                editarUsuarios();
            }else if(opc==4){
                borrarUsuarios();
            }else if(opc == 0){}
        }while(opc != 0);

    }
    public static void visualizarUsuarios(){
        Conection.muestraUsuarios();
    }

    public static void addUsuario(){
    	 System.out.print("Por favor, ingrese su nombre: ");
    	    scanner.nextLine();
    	    String name = scanner.nextLine();

    	    System.out.print("Por favor, ingrese su apellido: ");
    	    String lastname = scanner.nextLine();

    	    System.out.print("Por favor, elija un nombre de usuario: ");
    	    String username = scanner.nextLine();

    	    System.out.print("Por favor, cree una contraseña: ");
    	    Integer password = scanner.nextInt();
        Conection.addUsuarios(name,lastname,username,password);
    }

    public static void editarUsuarios(){
        Conection.muestraUsuarios();
        System.out.print("Ingrese id del usuario que quiere editar: ");
        long id =scanner.nextLong();
        
        System.out.print("Por favor, ingrese su nuevo nombre: ");
	    scanner.nextLine();
	    String name = scanner.nextLine();

	    System.out.print("Por favor, ingrese su nuevo apellido: ");
	    String lastname = scanner.nextLine();

	    System.out.print("Por favor, elija un nuevo nombre de usuario: ");
	    String username = scanner.nextLine();

	    System.out.print("Por favor, ingrese una nueva contraseña: ");
	    Integer password = scanner.nextInt();
        Conection.updateUsuarios(id,name,lastname,username,password);
    }
    
    public static void borrarUsuarios(){
        Conection.muestraUsuarios();
        System.out.print("¿Cuál es el ID del usuario que quieres eliminar?: ");
        long id = scanner.nextLong();
        Conection.deleteUsuario(id);
    }
}
