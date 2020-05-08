package Exercise2;

/**
 * Class that works to create a figure
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public abstract class Figure implements AbstractFigure {

    private String name;
    private Identation identation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Identation getIdentation() {
        return identation;
    }

    public void setIdentation(Identation identation) {
        this.identation = identation;
    }

}
