package tp6;

public class Livre extends Article {
    private String editeur;

    public Livre() { super(); }

    public Livre(String titre, int numero, int nbPages, String auteur, String editeur) {
        super(titre, numero, nbPages, auteur);
        this.editeur = editeur;
    }

    public String getEditeur() { return editeur; }
    public void setEditeur(String editeur) { this.editeur = editeur; }

    @Override
    public String getType() { return "Livre"; }

    @Override
    public void Edition() {
        super.Edition();
        System.out.println("   Editeur : " + editeur);
    }
}
