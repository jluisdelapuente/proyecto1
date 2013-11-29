package Entidades;
public class Productos {
    int id;
    String nombre="";
    String Descripcion="";
    double precio=0;
    double stock=0;
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDescripcion() {return Descripcion;}
    public void setDescripcion(String Descripcion) {this.Descripcion = Descripcion;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
    public double getStock() {return stock;}
    public void setStock(double stock) {this.stock = stock;}
}
