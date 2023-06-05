public class Main {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda();

        tienda1.agregar(new Producto(100,"Prod1",4,10.01));
        tienda1.agregar(new Producto(200,"Prod2",2,12.45));
        tienda1.agregar(new Producto(300,"Prod3",3,2.50));

        int codigo = 200;
        Producto result = tienda1.buscarPorId(codigo);
        System.out.println("Antes de la venta");
        if(result!=null){
            System.out.println("Nombre del Producto: "+result.getNombre()+" Cantidad: "+result.getCantidad()+result.getPrecio());
        }else{
            System.out.println("Producto no encontrado");
        }


        Producto p1 = new Producto(1000,"",0,0);
        tienda1.vender(p1,1);

        codigo = 300;
        result = tienda1.buscarPorId(codigo);

        System.out.println("Despues de la venta");
        if(result!=null){
            System.out.println(result.getNombre()+" Cantidad: "+result.getCantidad());
        }else{
            System.out.println("Producto "+ codigo +" no encontrado");
        }
    }
}
