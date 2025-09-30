import java.util.ArrayList;
import java.util.List;

public class Benutzerverwaltung {
    private List<Benutzer> BenutzerListe = new ArrayList<>();

    public Benutzerverwaltung(){

    } 



    public boolean login(String username, String passwort){
       for(Benutzer b : BenutzerListe){
            if (b.getUserName().equals(username) && b.getPasswort().equals(passwort)){
                return true;
            }
            
       }
        return false;
     }



     public  void registrieren(Benutzer b){
        BenutzerListe.add(b);
     }


     public List<Benutzer> getAlleBenutzer(){
        return BenutzerListe;
     }
}
