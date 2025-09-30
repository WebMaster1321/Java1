
import java.time.LocalDate;
import java.time.Period;

 public class Person{
    private int id;
    private String vorname;
    private String nachname;
     LocalDate geburtsdatum;

    public Person(int id, String vorname,String nachname,LocalDate geburtsdatum){
      this.id = id;
      this.vorname = vorname;
      this.nachname = nachname;
      this.geburtsdatum = geburtsdatum;

    }


public String getFullname(){
    return vorname + "" + nachname;


}

public int getAlter(){
    return Period.between(geburtsdatum,LocalDate.now()).getYears();
}










}