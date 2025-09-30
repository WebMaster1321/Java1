import java.util.ArrayList;
import java.util.List;

public class Kurs {
    private Fach fach;
    private Lehrer lehrer;
    private List<Schueler> schuelerListe = new ArrayList<>();


    public Kurs( Fach fach,Lehrer lehrer){
        this.fach = fach;
        this.lehrer= lehrer;
    }


    public void addSchueler( Lehrer a,Schueler s){
        if (a.equals(this.lehrer)){
            schuelerListe.add(s);
        }else{
            System.out.println("Nur der zugeordnete Lehrer darf Schüler hinzufügen!");
        }
        
    }

    public void removeSchueler( Lehrer a,Schueler s){
        if (a.equals(this.lehrer)){
            schuelerListe.remove(s);
        }else{
            System.out.println("Nur der zugeordnete Lehrer darf Schüler entfernen!");
        }
    }

    public List<Schueler> getTeilnehmer(){
        return schuelerListe;
    }

    public Fach getFach(){
        return this.fach;
    }
}
