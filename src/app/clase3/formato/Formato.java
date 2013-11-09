package app.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) {
        //Formato.numberFormat();
        //Formato.modedaFormato();
        //Formato.GregorianCalendar();
        //Formato.SimpeDateFormat();
        Formato.SimpeDateFormato();
        //Formato.CompararFechas();


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

        Locale localPeru = new Locale("es", "PE");
        NumberFormat formatoPeru = NumberFormat.getCurrencyInstance(localPeru);
        formatoPeru.setGroupingUsed(false);

        System.out.println("Moneda Euro :" + formatoAleman.format(1505));
        System.out.println("Moneda Dolar :" + FormatoAmericano.format(150));
        System.out.println("Moneda Soles :" + formatoPeru.format(150));
    }

    public static void GregorianCalendar() {
        // GregorianCalendar ahora = new GregorianCalendar();
        Calendar ahora = new GregorianCalendar(1985, 11, 3);
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH) + 1);
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
//
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
//
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
        System.out.println("Total semanas del año: " + ahora.getWeeksInWeekYear());




    }

    public static void dateFotmat() {
        Date now = new Date();
        System.out.println(now.getTime());

        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);


        System.out.println(df1.format(now));
        System.out.println(df2.format(now));
        System.out.println(df3.format(now));
        System.out.println(df4.format(now));
        System.out.println(df5.format(now));
        System.out.println(df6.format(now));







    }

    public static void SimpeDateFormat() {

        DateFormat df = new SimpleDateFormat("EEEE dd MMMM");

        Date now = new Date();

        System.out.println(df.format(now));
       
    }

    public static void CompararFechas() {

        Calendar c1 = new GregorianCalendar(2011, 9, 3);
        Date fecha1 = c1.getTime();
        
        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date fecha2 = c2.getTime();
       
        if (fecha1.after(fecha2)) {
            System.out.println("Fecha1 es después que Fecha2");
        }
        
        if (fecha1.before(fecha2)) {
            System.out.println("Fecha1 es antes que Fecha2");
        }

    }
    
    public static void SimpeDateFormato() {

        DateFormat df = new SimpleDateFormat("D");

        Date now = new Date();

        System.out.println(df.format(now));
    
}
    
}
