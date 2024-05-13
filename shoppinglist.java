import java.util.LinkedList;

public class shoppinglist {

    public static LinkedList<String> bevasarlolistakeszito() {
        LinkedList<String> bevasarlolista = new LinkedList<>();
        bevasarlolista.add("tojások");
        bevasarlolista.add("tej");
        bevasarlolista.add("hal");
        bevasarlolista.add("almak");
        bevasarlolista.add("kenyér");
        bevasarlolista.add("csirke");
        return bevasarlolista;
    }

    public static String bennevane(LinkedList<String> bevasarlolista, String termek) {
        if (bevasarlolista.contains(termek)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        LinkedList<String> bevasarlolista = bevasarlolistakeszito();
        
        System.out.println(bennevane(bevasarlolista, "tej"));
        System.out.println(bennevane(bevasarlolista, "banán"));
    }
}