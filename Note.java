import java.time.LocalDate;



public class Note{
    private int wert;
    private LocalDate datum;
    private Fach fach;

    public Note(int wert,LocalDate datum, Fach fach){
        this.wert = wert;
        this.datum = datum;
        this.fach  = fach;
    }


    public int getWert(){
        return this.wert;
    }


    public Fach getFach(){
        return  this.fach; 
    }


    public boolean isBestanden(Note note){
        return this.wert <= 4;

}
}