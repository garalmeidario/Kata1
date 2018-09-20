package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        
        Person p = new Person("Darío", new Date(98, 7, 7));
        System.out.println(p.getName() + " tiene " + p.getYear() + " años");
        

    }
    
}
