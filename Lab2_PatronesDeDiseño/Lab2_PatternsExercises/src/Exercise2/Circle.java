package Exercise2;

/**
 * Class that allow to create a Circle figure
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Circle extends AbstractFigure {

    private Coordinates coordinateCentralPoint;
    private double radiusDistance;

    public Coordinates getCoordinateCentralPoint() {
        return coordinateCentralPoint;
    }

    public void setCoordinateCentralPoint(Coordinates coordinateCentralPoint) {
        this.coordinateCentralPoint = coordinateCentralPoint;
    }

    public double getRadiusDistance() {
        return radiusDistance;
    }

    public void setRadiusDistance(double radiusDistance) {
        this.radiusDistance = radiusDistance;
    }

    @Override
    public Object cloneMethod() {
        Circle circle = new Circle();
        circle.setCoordinateCentralPoint(coordinateCentralPoint);
        circle.setRadiusDistance(radiusDistance);
        circle.setName(super.getName());
        circle.setIdentation(super.getIdentation());
        return circle;
    }

    @Override
    public String list() {
        return super.getIdentation().getIdentation() + super.getName() + "{" + coordinateCentralPoint.toString()
                + ", " + radiusDistance + "}\n";
    }

}
