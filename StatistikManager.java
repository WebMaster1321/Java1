import java.util.ArrayList;
import java.util.List;

public class StatistikManager {
    public Schueler besterSchueler(Kurs k){
        Schueler bester = null;
        double besterDurschnitt = Double.MAX_VALUE;
        for (Schueler s : k.getTeilnehmer()){
             double d = s.getDurchschnitt();


            if(d< besterDurschnitt){
                besterDurschnitt =d;
                bester = s;
            }
        }
        return bester;
    }
private List<Schueler>  schuelerListe = new ArrayList<>();


public double durchschnittNoteKlasse(String klasse){
     double summe = 0;
     int anzahl = 0;

     for(Schueler s : schuelerListe){
        if(s.klasse.equalsIgnoreCase(klasse)){
            for (Note n : s.getNoten()){
                 summe += n.getWert();
                 anzahl++;
            }
        }
     }
     if(anzahl > 0){
        return summe/anzahl;
     }else{
        return 0;
     }
}



}
