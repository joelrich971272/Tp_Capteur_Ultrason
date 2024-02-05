import clavier.In;

public class Main extends LiaisonSerie {
    public static void main(String[] args) {
        Mb1414 mb1414 = new Mb1414() ;
        System.out.println(mb1414.listerLesPorts().toString());
        System.out.println("Quel port com ?");
        In.readString();


    }
}
