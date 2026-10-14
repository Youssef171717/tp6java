package tp6;

public class Document {
    private String titre;
    private int numero;
    private int nbPages;

    public Document() { }

    public Document(String titre, int numero, int nbPages) {
        this.titre = titre;
        this.numero = numero;
        this.nbPages = nbPages;
    }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public int getNbPages() { return nbPages; }
    public void setNbPages(int nbPages) { this.nbPages = nbPages; }

    public String getType() { return "Document"; }

    public void Edition() {
        System.out.println("Type : " + getType()
            + " | Titre : " + titre
            + " | N° : " + numero
            + " | Pages : " + nbPages);
    }
}
