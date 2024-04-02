import java.util.Scanner;

public class Service {
    private Scanner s = new Scanner(System.in);

    public Client saisirClient() {
        Client clt = new Client();
        System.out.println("Donnez l'id du Client : ");
        clt.setId(s.nextInt());
        s.nextLine();
        System.out.println("Donnez le nom complet du client : ");
        clt.setNomComplet(s.nextLine());
        System.out.println("Donnez la taille du client : ");
        clt.setTaille(s.nextDouble());
        return clt;
    }

    public void saisirClient2(Client clt) {
        //lorsqu'un objet est en parametre alors c'est D/R
        //lorsqu'un type primitif est en parametre alors c'est D
        System.out.println("Donnez l'id du Client : ");
        clt.setId(s.nextInt());
        s.nextLine();
        System.out.println("Donnez le nom complet du client : ");
        clt.setNomComplet(s.nextLine());
        System.out.println("Donnez la taille du client : ");
        clt.setTaille(s.nextDouble());
    }

    public void afficherClient(Client clt){
        System.out.println("Identifiant Client : " + clt.getId());
        System.out.println("Nom Complet : " + clt.getNomComplet());
        System.out.println("Taille  : " + clt.getTaille() + "cm");
    }

    
}
