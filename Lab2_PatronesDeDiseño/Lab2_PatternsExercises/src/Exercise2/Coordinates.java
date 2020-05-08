package Exercise2;

/**
 * Class that works to create a coordinate with the axis x and y
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Coordinates {

    private double axisX;
    private double axisY;

    public Coordinates(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public double getAxisX() {
        return axisX;
    }

    public void setAxisX(double axisX) {
        this.axisX = axisX;
    }

    public double getAxisY() {
        return axisY;
    }

    public void setAxisY(double axisY) {
        this.axisY = axisY;
    }

    @Override
    public String toString() {
        return "Coordinates{" + "axisX=" + axisX + ", axisY=" + axisY + '}';
    }
}
