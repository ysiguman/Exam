/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
public abstract class Vehicule {
    private String modele;
    private int annee;
    private int prix;
    private String imat;
    private char noPermis;

    public Vehicule(String modele, int annee, int prix, String imat, char noPermis) {
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.imat = imat;
        this.noPermis = noPermis;
    }
}
