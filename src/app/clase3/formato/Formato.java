package app.clase3.formato;

import java.text.NumberFormat;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) {
        //Formato.numberFormat();
        Formato.modedaFormato();

    }

    public static void numberFormat() {

        NumberFormat nf = NumberFormat.getInstance(Locale.US);

        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));

        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));
        System.out.println("Con 3 enteros mínimo");


        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));
        System.out.println("Con 5 enteros máximo");

        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));
        System.out.println("Con 4 enteros máximo en los decimales");


        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(123.981454));
        System.out.println("Con 2 enteros mínimo en los decimales");

        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));

    }

    public static void modedaFormato() {

        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(true);

        NumberFormat FormatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        FormatoAmericano.setGroupingUsed(false);

        Locale lp = new Locale("es", "PE");
        NumberFormat formatoPeru = NumberFormat.getCurrencyInstance(lp);

        formatoPeru.setGroupingUsed(false);
        System.out.println("Moneda Euro :" + formatoAleman.format(1505));
        System.out.println("Moneda Dolar :" + FormatoAmericano.format(150));
        System.out.println("Moneda Soles :" + formatoPeru.format(150));
    }

    public static void fechaFormato() {

    
    
    }
}
