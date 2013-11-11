package app.clase2.aula.estatico;

public class AppEstatico {

    public static void main(String[] args) {    
        
        AppEstatico.AtributoEstatico();
        AppEstatico.MetodoEstatico();
    }
        
        public static void AtributoEstatico () {
        System.out.println(Estatico.contador);
        Estatico estuUn = new Estatico();
        Estatico estuDo = new Estatico();
        Estatico estutr = new Estatico();
        System.out.println(Estatico.contador);
    }
        
        public static void MetodoEstatico (){
         double euro = Estatico.dolaraEuro(10d);
         System.out.println(euro);
    }
        
    }



  /*
         System.out.println(Estatico.dolaraEuro(10d));
         System.out.println(Estatico.contador);
            
         */