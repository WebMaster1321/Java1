import java.util.ArrayList;
import java.util.List;

public class Schulverwaltung {
    private List<Schueler> schuelerListe = new ArrayList<>();
    private List<Lehrer> lehrerListe = new ArrayList<>();
    private List<Kurs> kursListe = new ArrayList<>();


    public void addSchhueler(Schueler schueler){
        schuelerListe.add(schueler);

    }

    public void removeSchueler(Schueler schueler){
        schuelerListe.remove(schueler);
    }


    public void addLehrer(Lehrer lehrer){
        lehrerListe.add(lehrer);
    }

    public void removeLehrer(Lehrer lehrer){
        lehrerListe.remove(lehrer);
    }
    
    public void addKurs(Kurs kurs){
        kursListe.add(kurs);
    }


    
    public List<Schueler> getAlleSchueler(){
       return  schuelerListe;
        
    }
    public List<Kurs> getAlleKurse(){
        return kursListe;
    }
    public List<Schueler> findeSchuelerNachName(String name){
        List<Schueler> treffer = new ArrayList<>();


        for(schueler s : schuelerListe){
            if(s.getNachname().equalsIngnoreCase(name)) {
                treffer.add(s);
            }
        }
        return treffer;
    } 
}