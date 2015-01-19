package composite;

/**
 * Created by tomasz on 19.01.15.
 */
public class Main {

    public static void main(String[] args) {
        Solider serialClark = new Solider("Clark");
        Solider serialAndy = new Solider("Andy");
        Solider serialMichael = new Solider("Michael");

        Solider commandorSteve = new Solider("Steve");
        commandorSteve.addMember(serialClark);
        commandorSteve.addMember(serialMichael);
        commandorSteve.addMember(serialAndy);

        System.out.println(commandorSteve);
    }
}
