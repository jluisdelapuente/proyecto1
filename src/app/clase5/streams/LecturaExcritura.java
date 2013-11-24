package app.clase5.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaExcritura {

    public static void main(String[] args) {
        LecturaExcritura.escribirArchivo();
        LecturaExcritura.leerArchivo();
    }
    
    
    
    public static void escribirArchivo() {

        try {
            FileWriter fw = new FileWriter("d://javaTecsup/ejemplo2.txt"); //se puede utilizar \\ o // 
            BufferedWriter bw = new BufferedWriter(fw);

            bw = new BufferedWriter(fw);
            bw.write("Funciona la cosa esta????");
            bw.newLine();
            bw.write("si,si ha funcionado!!!!");
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
    }

    public static void leerArchivo() {
        String sInput;
        try {
            FileReader fr = new FileReader("d://javaTecsup/ejemplo2.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
