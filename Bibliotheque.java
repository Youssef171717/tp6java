package tp6;

public class Bibliotheque {
    private Document[] listdoc;
    private int nombreDocuments;
    private int capacite;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.listdoc = new Document[capacite];
        this.nombreDocuments = 0;
    }

    public int getCapacite() { return capacite; }
    public int getNombre_document() { return nombreDocuments; }

    public void Ajout_doc(Document d) {
        if (nombreDocuments == capacite) {
            System.out.println("Bibliotheque pleine : ajout impossible.");
            return;
        }
        int i = nombreDocuments - 1;
        while (i >= 0 && listdoc[i].getNumero() > d.getNumero()) {
            listdoc[i + 1] = listdoc[i];   // décalage vers la droite
            i--;
        }
        listdoc[i + 1] = d;
        nombreDocuments++;
    }

    public void Supprim_doc(int num) {
        int pos = -1;
        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i].getNumero() == num) { pos = i; break; }
        }
        if (pos == -1) {
            System.out.println("Document n°" + num + " introuvable.");
            return;
        }
        for (int i = pos; i < nombreDocuments - 1; i++) {
            listdoc[i] = listdoc[i + 1];   // décalage vers la gauche
        }
        listdoc[nombreDocuments - 1] = null;
        nombreDocuments--;
    }

    public void Inventaire_doc() {
        System.out.println("--- Inventaire (" + nombreDocuments + " documents) ---");
        for (int i = 0; i < nombreDocuments; i++) {
            listdoc[i].Edition();
        }
    }

    private Bibliotheque filtrer(String type) {
        Bibliotheque b = new Bibliotheque(capacite);
        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i].getType().equals(type)) {
                b.Ajout_doc(listdoc[i]);
            }
        }
        return b;
    }

    public Bibliotheque liste_livre()       { return filtrer("Livre"); }
    public Bibliotheque liste_article()     { return filtrer("Article"); }
    public Bibliotheque liste_docsimples()  { return filtrer("Document"); }
    public Bibliotheque liste_periodique()  { return filtrer("Periodique"); }
}
