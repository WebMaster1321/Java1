
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.security.sasl.RealmChoiceCallback;

public class Schueler extends Person{
    public String klasse;
    private List<Note> notenListe;
    






    public Schueler(int id, String vorname, String nachname, LocalDate geburtsdatum,String klasse) {
        super(id, vorname, nachname, geburtsdatum);
        this.klasse = klasse;
        this.notenListe = new ArrayList<>();


    }

    public void addNote(notenListe Note){
        notenListe.add(note)

    }

    double summe = 0;
    int anzahl = 0;
    public void getDurschnitt(notenListe Note){
        for Note in notenListe(){
            summe = summe + Note.getWert();
            anzahl = anzahl + 1;
        }

        if (anzahl> 0){
            return summe / anzahl;
        } else{
            return 0;
        }
         
        
    }



}