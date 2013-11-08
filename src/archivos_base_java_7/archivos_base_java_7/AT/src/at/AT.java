
package at;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public class AT  extends JFrame implements ActionListener{
    private JMenuBar barra;
        private JMenu menu1;
        private JMenuItem mi1, mi2, mi3, mi4;
        private JTextField camponuevonombre, camponuevotelefono, campobuscanombre;
        private JLabel etiquetanuevonombre, etiquetanuevotelefono, etiquetabuscanombre, imprimenombre, imprimetelefono, nombreprograma, nombreautor, numeroversion;
        private JButton boton, botonnuevo, botonbusca;
        File archivo = new File("C://pruebas//archivo.txt");
        Formatter nuevoarchivo;
        Scanner x;
        
        public AT(){
        setLayout(null);
        nombreprograma = new JLabel("Agenda telefonica");
                nombreprograma.setBounds(0,0,180,30);
                add(nombreprograma);
                nombreautor = new JLabel("Jose Vicente Carratala");
                nombreautor.setBounds(0,30,180,30);
                add(nombreautor);
                numeroversion = new JLabel("version 1");
                numeroversion.setBounds(0,50,180,30);
                add(numeroversion);
        barra = new JMenuBar();
        setJMenuBar(barra);
        
        menu1 = new JMenu("Archivo");
        barra.add(menu1);
        
        mi1 = new JMenuItem("Nuevo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        
        mi2 = new JMenuItem("Buscar");
        mi2.addActionListener(this);
        menu1.add(mi2);
        
       
        mi4 = new JMenuItem("Salir");
        mi4.addActionListener(this);
        menu1.add(mi4);
        
        }
        
        public void actionPerformed(ActionEvent e){
            Container f=this.getContentPane();
            if(e.getSource()==mi1){
              etiquetanuevonombre = new JLabel("Nuevo nombre:");
                etiquetanuevonombre.setBounds(0,0,180,30);
                add(etiquetanuevonombre);
                etiquetanuevonombre.setVisible(true);
                //Entrada de usuario
                camponuevonombre = new JTextField();
                camponuevonombre.setBounds(200,10,300,30);
                add(camponuevonombre);
                camponuevonombre.setVisible(true);
                etiquetanuevotelefono = new JLabel("Nuevo telefono:");
                etiquetanuevotelefono.setBounds(0,50,180,30);
                add(etiquetanuevotelefono);
                etiquetanuevotelefono.setVisible(true);
                //Entrada de usuario
                camponuevotelefono = new JTextField();
                camponuevotelefono.setBounds(200,50,300,30);
                add(camponuevotelefono);
                camponuevotelefono.setVisible(true);
                //Texto
                
                botonnuevo = new JButton("Crear");
                botonnuevo.setBounds(10,120,200,30);
                add(botonnuevo);
                botonnuevo.addActionListener(this);
                botonnuevo.setVisible(true);
                
                etiquetabuscanombre.setVisible(false);
                campobuscanombre.setVisible(false);
                botonbusca.setVisible(false);
                nombreprograma.setVisible(false);
                        nombreautor.setVisible(false);
                        numeroversion.setVisible(false);
            }
            if(e.getSource()==mi2){
                etiquetanuevonombre.setVisible(false);
                camponuevonombre.setVisible(false);
                etiquetanuevotelefono.setVisible(false);
                camponuevotelefono.setVisible(false);
                botonnuevo.setVisible(false);
                nombreprograma.setVisible(false);
                        nombreautor.setVisible(false);
                        numeroversion.setVisible(false);
                //Texto
                etiquetabuscanombre = new JLabel("Busqueda por nombre:");
                etiquetabuscanombre.setBounds(0,0,180,30);
                add(etiquetabuscanombre);
                etiquetabuscanombre.setVisible(true);
                //Entrada de usuario
                campobuscanombre = new JTextField();
                campobuscanombre.setBounds(200,10,300,30);
                add(campobuscanombre);
                campobuscanombre.setVisible(true);
                //Texto
                
                botonbusca = new JButton("Buscar");
                botonbusca.setBounds(10,90,200,30);
                add(botonbusca);
                botonbusca.addActionListener(this);
                botonbusca.setVisible(true);
            }
            if(e.getSource()==mi3){
               
            }
            if(e.getSource()==mi4){
                System.exit(0);
            }
            if(e.getSource()==botonbusca){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","");
                    Statement estado = con.createStatement();
                    ResultSet resultado = estado.executeQuery("SELECT * FROM agenda WHERE nombre = '"+ campobuscanombre.getText() +"'");
                    System.out.println("SELECT * FROM agenda WHERE 'nombre' = '"+ campobuscanombre.getText() +"'");  
                    while(resultado.next()){
                   if(archivo.exists()){
                        if(archivo.canWrite()){
                            System.out.println("El archivo existe y puedo escribir");
                            nuevoarchivo = new Formatter("C://pruebas//archivo.txt");
                            nuevoarchivo.format("%s%s%s",resultado.getString("nombre"),resultado.getString("telefono"),"telefono");
                            nuevoarchivo.close();
                        }else{
                            System.out.println("El archivo existe pero no puedo escribir");
                        }
                    }else{
                        try{
                            nuevoarchivo = new Formatter("C://pruebas//archivo.txt");
                            nuevoarchivo.format("%s%s%s",resultado.getString("nombre"),resultado.getString("telefono"),"telefono");
                            nuevoarchivo.close();
                        }
                        catch(Exception errr){
                            System.out.println("Error: " + errr);
                        }
                    }  } 
                }
                
                catch(SQLException ex){
            System.out.println("Error de mysql");
        }
        catch(ClassNotFoundException err){
            err.printStackTrace();
            
        }
        catch(Exception err){
            System.out.println("Se ha encontrado un error que es: "+err.getMessage());
            
        }
           }
             if(e.getSource()==botonnuevo){
                try{
              Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","");
              Statement estado = con.createStatement();
        estado.executeUpdate("INSERT INTO agenda VALUES ('2',  '"+camponuevonombre.getText()+"', '"+camponuevotelefono.getText()+"')");
          
        
                 
        
                }
                
                catch(SQLException ex){
            System.out.println("Error de mysql");
        }
        catch(ClassNotFoundException err){
            err.printStackTrace();
            
        }
        catch(Exception err){
            System.out.println("Se ha encontrado un error que es: "+err.getMessage());
            
        }
           }
        }
        
    public static void main(String[] args) {
       AT ventana = new AT();
        ventana.setBounds(10,20,640,250);
        ventana.setVisible(true);
    }
}
