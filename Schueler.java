
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

<<<<<<< HEAD
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
=======
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
    public void getNoten(notenListe Note){
        return Note;
>>>>>>> 577c10c29a879cba0f8a8894d9d4a9146026dbae
    }

    public String getNachname(){
        return this.nachname;
    }

}