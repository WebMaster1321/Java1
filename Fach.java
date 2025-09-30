public class Fach{
    private String name;
    private String beschreibung;

    public Fach(String name, String beschreibung){
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public String getName(){
        return name;
    }

    public String getBeschreibung(){
        return beschreibung;
    }
}