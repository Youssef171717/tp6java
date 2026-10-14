package tp6;

public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque b = new Bibliotheque(10);

        b.Ajout_doc(new Livre("Java facile", 30, 250, "Ali Ben Salah", "Eyrolles"));
        b.Ajout_doc(new Document("Rapport", 10, 40));
        b.Ajout_doc(new Periodique("Science Mag", 20, 60, "Mensuel"));
        b.Ajout_doc(new Article("Les reseaux", 5, 12, "Sara Trabelsi"));
        b.Ajout_doc(new Livre("Algorithmes", 15, 400, "Omar Jlassi", "Dunod"));

        b.Inventaire_doc();

        System.out.println("\nSuppression du document n°20");
        b.Supprim_doc(20);
        b.Inventaire_doc();

        System.out.println("\nLivres :");
        b.liste_livre().Inventaire_doc();
        System.out.println("\nArticles :");
        b.liste_article().Inventaire_doc();
        System.out.println("\nDocuments simples :");
        b.liste_docsimples().Inventaire_doc();
        System.out.println("\nPeriodiques :");
        b.liste_periodique().Inventaire_doc();
    }
}
