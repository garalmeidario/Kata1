package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1998, 8, 7);
        Person p = new Person("Darío", date);
        System.out.println(p.getName() + " tiene " + p.getYear() + " años");
        

    }
    
}
