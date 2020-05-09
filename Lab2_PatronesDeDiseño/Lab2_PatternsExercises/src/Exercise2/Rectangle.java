package Exercise2;

/**
 * Class that allow to create a Rectangle figure
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Rectangle extends AbstractFigure {

    private Coordinates coordinatesUpperLeftPoint;
    private double high;
    private double weigth;

    public Coordinates getCoordinatesUpperLeftPoint() {
        return coordinatesUpperLeftPoint;
    }

    public void setCoordinatesUpperLeftPoint(Coordinates coordinatesUpperLeftPoint) {
        this.coordinatesUpperLeftPoint = coordinatesUpperLeftPoint;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public Object cloneMethod() {
        Rectangle rectangle = new Rectangle();
        rectangle.setCoordinatesUpperLeftPoint(coordinatesUpperLeftPoint);
        rectangle.setHigh(high);
        rectangle.setWeigth(weigth);
        rectangle.setName(super.getName());
        rectangle.setIdentation(super.getIdentation());
        return rectangle;
    }

    @Override
    public String list() {
        return super.getIdentation().getIdentation() + super.getName()
                + "{" + coordinatesUpperLeftPoint.toString() + ", "
                + high + ", " + weigth + "}\n";
    }

}
