package Interfaces;
import Entidades.Productos;
import java.util.ArrayList;
public interface IDaoProductos {
    public void Agregar_Producto(Productos producto);
    public void Eliminar_Producto(int id);
    public void Modificar_Producto(int id,Productos producto);
    public ArrayList<Productos> ListaProductos();
    public ArrayList<Productos> Buscar_Producto(int id);
}
