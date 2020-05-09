package Exercise2;

/**
 * Class that works contains a factory method that decide that figure build
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class FigureFactory {

    /**
     * Method that decide that figure create and create the figure
     *
     * @param name the figure create
     * @param identation the identation of the figure
     * @param coordinates the coordinates of the figure
     * @param high contains the height of the figure, this parameter is only
     * used if the figure has height, in case it does not have it it is not used
     * even if it has some value.
     * @param weight contains the weight of the figure, this parameter is only
     * used if the figure has weight, in case it does not have it it is not used
     * even if it has some value.
     * @param radius contains the radius of the figure, this parameter is only
     * used if the figure has radius, in case it does not have it it is not used
     * even if it has some value.
     * @return the figure created
     * @throws InformationRequiredException
     */
    public AbstractFigure createFigure(String name, Identation identation, Coordinates coordinates,
            double high, double weight, double radius) throws InformationRequiredException {
        name = name.toLowerCase();
        AbstractFigure figure = null;
        Scheduler scheduler = new Scheduler();
        if (name.equals("circle")) {
            figure = scheduler.createCircle(null, "Circle", identation, coordinates, radius);
        } else if (name.equals("rectangle")) {
            figure = scheduler.createRectangle(null, "Rectangle", identation, coordinates, high, weight);
        }
        return figure;
    }

}
