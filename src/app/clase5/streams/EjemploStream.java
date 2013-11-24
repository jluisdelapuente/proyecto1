package app.clase5.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploStream {

   
    private List<String> lineas;
    private String fileName;

    public EjemploStream(String file) {
        this.lineas = new ArrayList<String>();
        this.fileName = file;
    }

    public void actualizar() {
        leerArchivo();
        guardarArchivo();
    }

    private void leerArchivo() {
        try {
            String line;
            FileReader fr = new FileReader(this.fileName);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                this.lineas.add(line);
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }

    }

    private void guardarArchivo() {
        try {
            FileWriter fw = new FileWriter(this.fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
            bw.write("Funciona la cosa esta??");
            bw.newLine();
            bw.write("Si Funciona");
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
