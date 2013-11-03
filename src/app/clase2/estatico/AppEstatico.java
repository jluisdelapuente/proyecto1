package app.clase2.estatico;

public class AppEstatico {

    public static void main(String[] args) {
        AppEstatico.runAtributoEstatico();
        AppEstatico.runMetodoEstatico();
    }
        
        public static void runAtributoEstatico {
        System.out.println(Estatico.contador);
        Estatico estuUn = new Estatico();
        Estatico estuDo = new Estatico();
        Estatico estutr = new Estatico();
        System.out.println(Estatico.contador);
    }
        
        public static void runMetodoEstatico {
         double euro = Estatico.dolaraEuro(10d);
         System.out.println(euro);
    }
        
    }



  /*
         System.out.println(Estatico.dolaraEuro(10d));
         System.out.println(Estatico.contador);
            
         */