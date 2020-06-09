package tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tester {

    public static void main(String[] args) {
         String strDepartureDate;
         String strReturnDate;

         //String list = "MXN$5,678";
        // list = list.replaceAll("[^\\d.]", "");
       // System.out.println(list);

        Calendar departureDate = Calendar.getInstance();
        departureDate.add(Calendar.DATE, 3);
        System.out.println(departureDate);

        Calendar returnDate = Calendar.getInstance();
        returnDate.add(Calendar.DATE, 6);
        System.out.println(returnDate);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        strDepartureDate = dateFormat.format(departureDate.getTime());
        strReturnDate = dateFormat.format(returnDate.getTime() );

        System.out.println(strDepartureDate);
        System.out.println(strReturnDate);
    }
}

