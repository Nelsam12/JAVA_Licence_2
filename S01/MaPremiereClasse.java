import java.util.Scanner;

class MaPremiereClasse{
    public static void main(String[] args) {
        System.out.println("C'est le cours de Java");
        // Les types primitifs ou de valeurs
        int x = 2;
        short y = 3;
        long z = 15;

        double u = 3.14; 
        float f = 3.14f; // maximum 6 chiffres après la virgule

        boolean ok = true;

        char c = 'a';

        // Les classes ou type de référence

        String s = new String("Bonjour");
        String l = "Bonjour";
        
        // System.in => Clavier
        // System.out => Ecran
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un reel : ");
        double a1 = sc.nextDouble();
        System.out.println("La valeur saisie est : " + a1);
        sc.nextLine(); //Qui va représenter le fflush
        System.out.println("Entrez une chaine : ");
        String c1 = sc.nextLine();
        System.out.println("La valeur saisie est : " + c1);        
    }
}