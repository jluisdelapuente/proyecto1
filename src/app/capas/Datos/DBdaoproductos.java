package Datos;
import Entidades.Productos;
import Interfaces.IDaoProductos;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
public class DBdaoproductos implements IDaoProductos{
    Connection cn=new MiSql().getConnection();
    public void Agregar_Producto(Productos producto) {
        try{
            CallableStatement sp=(CallableStatement) cn.prepareCall("{call sp_Inserta_producto(?,?,?,?)}");
            sp.setString(1,producto.getNombre());
            sp.setString(2,producto.getDescripcion());
            sp.setDouble(3,producto.getPrecio());
            sp.setDouble(4,producto.getStock());
            sp.execute();
            sp.close();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al Insertar: "+e.getMessage());}
    }
    public void Eliminar_Producto(int id) {
        try{
            CallableStatement sp=cn.prepareCall("{call sp_Elimina_producto(?)}");
            sp.setInt(1, id);
            sp.execute();
            sp.close();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al Modificar: "+ e.getMessage());}
    }
    public void Modificar_Producto(int id, Productos producto) {
        try{
            CallableStatement sp=cn.prepareCall("{call sp_Modifica_producto(?,?,?,?,?)}");
            sp.setInt(1, id);
            sp.setString(2,producto.getNombre());
            sp.setString(3,producto.getDescripcion());
            sp.setDouble(4,producto.getPrecio());
            sp.setDouble(5,producto.getStock());
            sp.execute(); sp.close();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al Modificar: "+ e.getMessage());}
    }
    public ArrayList<Productos> ListaProductos() {
        ArrayList productos =new ArrayList<Productos>();
        try{
            CallableStatement sp=cn.prepareCall("{call sp_Lista_productos()}");
            sp.execute();
            ResultSet rs=sp.getResultSet();
            while(rs.next()){
                Productos producto=new Productos();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getDouble("cantidad"));
                productos.add(producto);
            }
            rs.close(); sp.close();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al Listar: "+ e.getMessage());}
        return productos;
    }
    public ArrayList<Productos> Buscar_Producto(int id) {
        ArrayList productos =new ArrayList<Productos>();
        try{
            CallableStatement sp=cn.prepareCall("{call sp_Lista_Productos_Buscar(?)}");
            sp.setInt(1, id);
            sp.execute();
            ResultSet rs=sp.getResultSet();
            while(rs.next()){
                Productos producto=new Productos();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getDouble("cantidad"));
                productos.add(producto);
            }
            rs.close();
            sp.close();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error al Buscar: "+ e.getMessage());}
        return productos;
    }
    
}
