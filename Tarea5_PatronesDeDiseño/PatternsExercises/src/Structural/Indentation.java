package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To develop a flexible way to create hierarchical tree structures of arbitrary
 * complexity, while enabling every element in the structure to operate with a
 * uniform interface
 */
public class Indentation {

    private final StringBuffer sbIndent;

    public Indentation() {
        this.sbIndent = new StringBuffer();
    }

    public String getSbIndent() {
        return sbIndent.toString();
    }

    /**
     * Method that increased the indentation three spaces
     */
    public void increaseIndentation() {
        sbIndent.append("   ");
    }

    /**
     * Method that decreased the indentation three spaces
     */
    public void decreaseIndentation() {
        if (sbIndent.length() >= 3) {
            sbIndent.setLength(sbIndent.length() - 3);
        }
    }
}
