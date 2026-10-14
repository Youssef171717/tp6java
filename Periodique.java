package tp6;

public class Periodique extends Document {
    private String frequence;

    public Periodique() { super(); }

    public Periodique(String titre, int numero, int nbPages, String frequence) {
        super(titre, numero, nbPages);
        this.frequence = frequence;
    }

    public String getFrequence() { return frequence; }
    public void setFrequence(String frequence) { this.frequence = frequence; }

    @Override
    public String getType() { return "Periodique"; }

    @Override
    public void Edition() {
        super.Edition();
        System.out.println("   Frequence : " + frequence);
    }
}
