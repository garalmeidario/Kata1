package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    
    private String name;
    private LocalDate birthdate;
    
    public Person(String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName(){
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getYear(){
        LocalDate hoy = LocalDate.now();
        return (int) Period.between(birthdate, hoy).getYears();
    
    }
       
}
