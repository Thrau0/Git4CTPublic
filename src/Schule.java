import java.sql.SQLOutput;

public class Schule {
    String name;
    Schule(String name) {this.name = name;}
    public String greet (){
        System.out.println("Mogen");

        System.out.println("Morgen Jamaikanuku");
        return "Technologie" + "und" + "Planung: " + name;
    }
}
