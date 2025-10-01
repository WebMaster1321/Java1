
<<<<<<< HEAD
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lehrer extends Person{
    private List<Fach> fachListe;
    public double gehalt;

    public Lehrer(int id, String vorname, String nachname, LocalDate geburtsdatum,List<Fach> fachListe,double gehalt){
        super(id, vorname, nachname, geburtsdatum);
        this.fachListe = new ArrayList<>();
        this.gehalt = gehalt;

        
    }

    public void addFach(Fach fach){
        fachListe.add(fach);

    }

    public List<Fach> getFaecher(){
        return fachListe;
        
    }


    
=======
import java.util.List;

public class Lehrer extends Person{
    private List<fach> fachListe;
    public double gehalt;

    public Lehrer(int id, String vorname, String nachname,List<fach> fachListe,double gehalt){
        super(int id ,String vorname,  )
    }

    public void addFach()
>>>>>>> 577c10c29a879cba0f8a8894d9d4a9146026dbae
}