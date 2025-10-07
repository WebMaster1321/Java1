
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.security.sasl.RealmChoiceCallback;





public class Schueler extends Person{
    public String klasse;
    private List<Note> notenListe;
    private String nachname;
    






    public Schueler(int id, String vorname, String nachname, LocalDate geburtsdatum,String klasse) {
        super(id, vorname, nachname, geburtsdatum);
        this.klasse = klasse;
        this.notenListe = new ArrayList<>();
        this.nachname = nachname;


    }

    public void addNote(Note note){
        notenListe.add(note);

    }

    public double getDurchschnitt() {
        double summe = 0;
        int anzahl = 0;
        for (Note note : notenListe) {
            summe += note.getWert();
            anzahl++;
        }
        if (anzahl > 0) {
            return summe / anzahl;
        } else {
            return 0;
        }
    }
    
    public List<Note> getNoten(){
        return notenListe;
    }

    public String getNachname(){
        return this.nachname;
    }

}