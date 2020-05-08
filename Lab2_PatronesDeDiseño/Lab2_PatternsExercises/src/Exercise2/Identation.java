package Exercise2;

/**
 * Class that works to create a identation, increase and decrease
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Identation {

    private final StringBuffer identation;

    public Identation() {
        this.identation = new StringBuffer();
    }

    public StringBuffer getIdentation() {
        return identation;
    }

    /**
     * Method that increase the identation
     */
    public void increaseIdentation() {
        identation.append("   ");
    }

    /**
     * Method that decrease the identation
     */
    public void decreaseIdentation() {
        if (identation.length() >= 3) {
            identation.setLength(identation.length() - 3);
        }
    }
}
