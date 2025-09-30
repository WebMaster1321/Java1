public class Benutzer {
    private String username;
    private String passwort;
    private BenutzerRolle rolle;

    public Benutzer(String username,String passwort,BenutzerRolle rolle){
        this.username = username;
        this.passwort = passwort;
        this.rolle = rolle;
    }


    
     

    @Override
    public String toString() {
    return "Benutzer{" +
           "name='" + this.username + '\'' +
           ", rolle=" + this.rolle +
           '}';
}

public String getUserName(){
    return username;


}

public String getPasswort(){
    return passwort;


}





}
