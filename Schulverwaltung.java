import java.util.ArrayList;
import java.util.List;

public class Schulverwaltung {
    private List<Schueler> schuelerListe = new ArrayList<>();
    private List<Lehrer> lehrerListe = new ArrayList<>();
    private List<Kurs> kursListe = new ArrayList<>();    

    BenutzerRolle rolleLehrer = BenutzerRolle.LEHRER;
    BenutzerRolle rolleAdmin = BenutzerRolle.ADMIN;

    public void addSchhueler(Schueler schueler,Benutzer benutzer){
        if (benutzer.getRolle() == rolleAdmin){
            schuelerListe.add(schueler);
            System.out.println("Schüler hinzugefügt");
        }else{
            System.out.println("Zugriff verweigert: Nur Admins dürfen  hinzufügen!");    
        }
        

    }

    public void removeSchueler(Schueler schueler,Benutze benutzer){
        if (benutzer.getRolle() == rolleAdmin){
            schuelerListe.remove(schueler);
            System.out.println("Schüler entfernt");

        }else{
            System.out.println("Zugriff verweigert: Nur Admins können Schüler entfernen");
        }
        
    }


    public void addLehrer(Lehrer lehrer,Benutzer benutzer){
        if(benutzer.getRolle == rolleAdmin){
            lehrerListe.add(lehrer);
            System.out.println("Lehrer hinzugefügt");
        }else{
            System.out.println("Zugiff verweigert: Nur Admins können schüler hinzufügen");
        }
        
    }

    public void removeLehrer(Lehrer lehrer,Benutzer benutzer){
        if(benutzer.getRolle() == rolleAdmin){
            lehrerListe.remove(lehrer);
            System.out.println("lehrer in die Liste hinzugefügt");

        }else{
            System.out.println("Zugriff verweigert:Nur Admnis können lerher aus der liste entfernen");
        }
        
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


        for(Schueler s : schuelerListe){
            if(s.getNachname().equalsIgnoreCase(name)) {
                treffer.add(s);
            }
        }
        return treffer;
    } 
}