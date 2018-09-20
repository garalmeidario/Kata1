package kata1;

import java.util.Calendar;

public class Person {
    
    private String name;
    private Calendar birthdate;
    private long mili_años = (long) (1000*60*60*24*365.25);
    
    public Person(String name, Calendar birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName(){
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getYear(){
        Calendar hoy = Calendar.getInstance();
        return (int) (getMiliSecond(hoy.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
    
    
    public long getMiliSecond(long milles){
        return milles / mili_años;
    }
    
}
