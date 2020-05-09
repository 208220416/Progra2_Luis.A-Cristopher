package Exercise2;

/**
 * Class that works to build a circle
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class CircleBuilder implements AbstractBuilder {

    private Circle circle;
    private String informationRequired;

    @Override
    public void buildFigure() {
        circle = new Circle();
        informationRequired = "";
    }

    @Override
    public void buildName(String name) {
        if (name != "" && name != null) {
            circle.setName(name);
        } else {
            informationRequired += "A name is required\n";
        }
    }

    @Override
    public void buildIdentation(Identation identation) {
        if (identation != null) {
            circle.setIdentation(identation);
        } else {
            informationRequired += "A indentation is required\n";
        }
    }

    /**
     * Method that build the coordinates of central point of the figure
     *
     * @param coordinatesCentralPoint the coordinates assing to the circle
     */
    public void buildCoordinatesCentralPoint(Coordinates coordinatesCentralPoint) {
        if (coordinatesCentralPoint != null) {
            if (coordinatesCentralPoint.getAxisX() > -1 && coordinatesCentralPoint.getAxisY() > -1) {
                circle.setCoordinateCentralPoint(coordinatesCentralPoint);
            } else {
                informationRequired += "The X and Y axis must be positive\n";
            }
        } else {
            informationRequired += "A coordinate is required\n";
        }
    }

    /**
     * Method that build the radius distance of the circle
     *
     * @param radiusDistance the radius distance assing
     */
    public void buildRadiusDsitance(double radiusDistance) {
        if (radiusDistance > -1) {
            circle.setRadiusDistance(radiusDistance);
        } else {
            informationRequired += "The radius distance must be positive\n";
        }
    }

    @Override
    public AbstractFigure getFigure() throws InformationRequiredException {
        if (informationRequired != "") {
            throw new InformationRequiredException(informationRequired);
        } else {
            if (circle.getRadiusDistance() - circle.getCoordinateCentralPoint().getAxisY() < 0) {
                informationRequired += "The difference between the height and the coordinates cannot be negative\n";
            }
            if (circle.getRadiusDistance() - circle.getCoordinateCentralPoint().getAxisX() < 0) {
                informationRequired = "";
                informationRequired += "The difference between the height and the coordinates cannot be negative\n";
            }
            if (informationRequired != "") {
                throw new InformationRequiredException(informationRequired);
            }
        }
        return circle;
    }

}
