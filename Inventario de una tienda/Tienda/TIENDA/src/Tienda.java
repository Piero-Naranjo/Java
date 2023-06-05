import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> inventario = new ArrayList<>();

    public void agregar(Producto producto) {
        inventario.add(producto);
    }

    public void vender(Producto producto,int cantidadVenta){
        Producto result = this.buscarPorId(producto.getId());
        if(result == null) {
            System.out.println("Producto " + producto.getId() + " no encontrado.");
            return;
        }
        int cantidadActual = result.getCantidad();
        if(cantidadActual>cantidadVenta){
            System.out.println("No existe la cantidad solicitada");
            return;
        }
        result.setCantidad(cantidadActual - cantidadVenta);
    }

    public Producto buscarPorId(int id) {
        for (Producto p : inventario) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
}
