package Exercise2;

/**
 * Class that works to build a Scheduler and allow create figures
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Scheduler {

    /**
     * Method that create a rectangle with the parameterns
     *
     * @param rectangleBuilder the builder of the rectangle
     * @param name the name of the figure
     * @param identation the identation of the figure
     * @param coordinatesUpperLeftPoint the coordinates of the figure
     * @param high the high of the figure
     * @param weight the weight of the figure
     * @return the rectangle build
     * @throws InformationRequiredException
     */
    public Rectangle createRectangle(RectangleBuilder rectangleBuilder, String name, Identation identation,
            Coordinates coordinatesUpperLeftPoint, double high, double weight) throws InformationRequiredException {
        if (rectangleBuilder == null) {
            rectangleBuilder = new RectangleBuilder();
        }
        rectangleBuilder.buildFigure();
        rectangleBuilder.buildName(name);
        rectangleBuilder.buildIdentation(identation);
        rectangleBuilder.buildHigh(high);
        rectangleBuilder.buildWeight(weight);
        rectangleBuilder.buildCoordinatesUpperLeftPoint(coordinatesUpperLeftPoint);
        return (Rectangle) rectangleBuilder.getFigure();
    }

    /**
     * Method that create a circle with the parameter
     *
     * @param circleBuilder the builder of the circle
     * @param name the name of the figure
     * @param identation the identation of the figure
     * @param coordinatesCentralPoint the coordinates of the figure
     * @param radiusDistance the radius distance of the figure
     * @return the circle build
     * @throws InformationRequiredException
     */
    public Circle createCircle(CircleBuilder circleBuilder, String name, Identation identation,
            Coordinates coordinatesCentralPoint, double radiusDistance) throws InformationRequiredException {
        if (circleBuilder == null) {
            circleBuilder = new CircleBuilder();
        }
        circleBuilder.buildFigure();
        circleBuilder.buildCoordinatesCentralPoint(coordinatesCentralPoint);
        circleBuilder.buildIdentation(identation);
        circleBuilder.buildName(name);
        circleBuilder.buildRadiusDsitance(radiusDistance);
        return (Circle) circleBuilder.getFigure();
    }

}
