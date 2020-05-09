package Exercise2;

/**
 * Class that works to build a rectangle
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class RectangleBuilder implements AbstractBuilder {

    private Rectangle rectangle;
    private String informationRequired;

    @Override
    public void buildFigure() {
        informationRequired = "";
        rectangle = new Rectangle();
    }

    @Override
    public void buildName(String name) {
        if (name != "" && name != null) {
            rectangle.setName(name);
        } else {
            informationRequired += "A name is required\n";
        }
    }

    @Override
    public void buildIdentation(Identation identation) {
        if (identation != null) {
            rectangle.setIdentation(identation);
        } else {
            informationRequired += "A indentation is required\n";
        }
    }

    /**
     * Method that build the coordinates of upper left point of the figure
     *
     * @param coordinatesUpperLeftPoint the coordinates assing to the rectangle
     */
    public void buildCoordinatesUpperLeftPoint(Coordinates coordinatesUpperLeftPoint) {
        if (coordinatesUpperLeftPoint != null) {
            if (coordinatesUpperLeftPoint.getAxisX() > -1 && coordinatesUpperLeftPoint.getAxisY() > -1) {
                rectangle.setCoordinatesUpperLeftPoint(coordinatesUpperLeftPoint);
            } else {
                informationRequired += "The X and Y axis must be positive\n";
            }
        } else {
            informationRequired += "A coordinate is required\n";
        }
    }

    /**
     * Method that build the height of the figure
     *
     * @param high the height assing
     */
    public void buildHigh(double high) {
        if (high > -1) {
            rectangle.setHigh(high);
        } else {
            informationRequired += "The height must be positive\n";
        }
    }

    /**
     * Method that build the weight of the figure
     *
     * @param weight the weight assing
     */
    public void buildWeight(double weight) {
        if (weight > -1) {
            rectangle.setWeigth(weight);
        } else {
            informationRequired += "The weight must be positive\n";
        }
    }

    @Override
    public AbstractFigure getFigure() throws InformationRequiredException {
        if (informationRequired != "") {
            throw new InformationRequiredException(informationRequired);
        } else {
            if (rectangle.getHigh() - rectangle.getCoordinatesUpperLeftPoint().getAxisY() < 0) {
                informationRequired += "The difference between the height and the coordinates cannot be negative\n";
            }
            if (rectangle.getWeigth() - rectangle.getCoordinatesUpperLeftPoint().getAxisX() < 0) {
                informationRequired = "";
                informationRequired += "The difference between the height and the coordinates cannot be negative\n";
            }
            if (informationRequired != "") {
                throw new InformationRequiredException(informationRequired);
            }
        }
        return rectangle;
    }

}
