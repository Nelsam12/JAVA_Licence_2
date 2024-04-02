class Main{
    public static void main(String[] args) {        
        Service serv = new Service();
        System.out.println("Approche 1");
        Client clt = serv.saisirClient();
        serv.afficherClient(clt);
        System.out.println("\nApproche 2");
        Client clt1 = new Client();
        serv.saisirClient2(clt1);
        serv.afficherClient(clt1);
    }
}