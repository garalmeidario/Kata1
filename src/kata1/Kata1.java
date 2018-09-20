package kata1;

import java.time.LocalDate;

public class Kata1 {
     
     public static void main(String[] args) {
         
        LocalDate date = LocalDate.of(1998, 8, 7);
        Person person = new Person("Darío", date);
        System.out.println(person.getName()+ " tiene "  + person.getYear() + " años");
    } 
        
}