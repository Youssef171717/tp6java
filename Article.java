package tp6;

public class Article extends Document {
    private String auteur;

    public Article() { super(); }

    public Article(String titre, int numero, int nbPages, String auteur) {
        super(titre, numero, nbPages);
        this.auteur = auteur;
    }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    @Override
    public String getType() { return "Article"; }

    @Override
    public void Edition() {
        super.Edition();
        System.out.println("   Auteur : " + auteur);
    }
}
