package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class that allow to create a Mural
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Mural extends AbstractFigure {

    private ArrayList<AbstractFigure> figures;

    public Mural(String name, Identation identation) {
        super.setName(name);
        figures = new ArrayList<>();
        super.setIdentation(identation);
    }

    public ArrayList<AbstractFigure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<AbstractFigure> figures) {
        this.figures = figures;
    }

    /**
     * Method that add a figure in the mural
     *
     * @param figure the figure added
     * @return the figure added
     */
    public AbstractFigure addFigure(AbstractFigure figure) throws InformationRequiredException {
        if (figure instanceof Mural) {
            if (((Mural) figure).getFigures().size() > 1) {
                figures.add(figure);
            } else {
                throw new InformationRequiredException("The mural sent as a "
                        + "parameter must contain at least two figures to be added");
            }
        } else {
            figures.add(figure);
        }
        return figure;
    }

    /**
     * Method that remove a figure in the mural
     *
     * @param figure the figure removed
     * @return the figure removed
     */
    public AbstractFigure removeFigure(AbstractFigure figure) {
        AbstractFigure f = null;
        if (figures.contains(figure)) {
            f = figure;
        }
        figures.remove(figure);
        return f;
    }

    @Override
    public String list() {
        String text = super.getIdentation().getIdentation() + super.getName() + "\n";
        super.getIdentation().increaseIdentation();
        Iterator<AbstractFigure> iterator = figures.iterator();
        while (iterator.hasNext()) {
            text += iterator.next().list();
        }
        super.getIdentation().decreaseIdentation();
        return text;
    }

    /**
     * Method that return the figure in the mural with the index indicated
     *
     * @param index the index of the figure return
     * @return the figure with the index indicated in the parameter
     */
    public AbstractFigure getFigure(int index) {
        if (index < figures.size() && index > 0) {
            return figures.get(index);
        }
        return null;
    }

    /**
     * Method that clone a specific figure in the mural
     *
     * @param index
     * @return
     */
    public AbstractFigure cloneMethod(int index) {
        return (AbstractFigure) figures.get(index).cloneMethod();
    }

    @Override
    public Object cloneMethod() {
        Mural muralClone = new Mural(super.getName() + "_Clone", super.getIdentation());
        Iterator<AbstractFigure> iterator = figures.iterator();
        AbstractFigure figureTemp = null;
        while (iterator.hasNext()) {
            figureTemp = (AbstractFigure) iterator.next();
            muralClone.getFigures().add((AbstractFigure) figureTemp.cloneMethod());
        }
        return muralClone;
    }
}
