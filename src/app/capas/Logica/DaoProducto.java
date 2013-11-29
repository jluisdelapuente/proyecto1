package Logica;
import Entidades.Productos;
import Interfaces.IDaoProductos;
import Datos.DBdaoproductos;
import java.util.ArrayList;
public class DaoProducto implements IDaoProductos{
    private DBdaoproductos dbproductos=new DBdaoproductos();
    public DaoProducto() {
        
    }
    public void Agregar_Producto(Productos producto) {
        dbproductos.Agregar_Producto(producto);
    }
    public void Eliminar_Producto(int id) {
        dbproductos.Eliminar_Producto(id);
    }
    public void Modificar_Producto(int id, Productos producto) {
        dbproductos.Modificar_Producto(id, producto);
    }
    public ArrayList<Productos> ListaProductos() {
        return dbproductos.ListaProductos();
    }
    public ArrayList<Productos> Buscar_Producto(int id) {
        return dbproductos.Buscar_Producto(id);
    }
}
