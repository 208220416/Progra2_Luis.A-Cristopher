package Exercise2;

/**
 * Class that works test and run the program
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Main {

    public static void main(String[] args) {

        FigureFactory factory1 = new FigureFactory();
        Identation identation1 = new Identation();
        try {
            Mural mural_1 = new Mural("Mural_1", identation1);
            Rectangle rectangle1_1 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(6, 4), 54, 6, 0);
            Circle circle1_1 = (Circle) factory1.createFigure("Circle", identation1, new Coordinates(22, 33), 0, 0, 544);
            Rectangle rectangle1_2 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(6, 5), 46, 37, 0);

            mural_1.addFigure(rectangle1_2);
            mural_1.addFigure(circle1_1);
            mural_1.addFigure(rectangle1_2);

            Mural mural_2 = new Mural("Mural_2", identation1);
            Rectangle rectangle2_1 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(6, 4), 34, 6, 0);
            Circle circle2_1 = (Circle) factory1.createFigure("Circle", identation1, new Coordinates(22, 33), 0, 0, 344);
            Circle circle2_2 = (Circle) factory1.createFigure("Circle", identation1, new Coordinates(22, 33), 0, 0, 244);

            mural_2.addFigure(rectangle2_1);
            mural_2.addFigure(circle2_1);
            mural_2.addFigure(circle2_2);

            mural_1.addFigure(mural_2);

            Rectangle rectangle1_3 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(6, 5), 465, 374, 0);
            mural_1.addFigure(rectangle1_3);

            System.out.println(mural_1.list());

            System.out.println("Cloning mural 1 in mural 3...");
            Mural mural_3 = (Mural) mural_1.cloneMethod();
            System.out.println(mural_3.list());

            System.out.println("Removing of the mural 3 the figure:\n" + mural_3.removeFigure(mural_3.getFigure(1)).list());

            System.out.println("Removing of the mural 3 the figure:\n" + mural_3.removeFigure(mural_3.getFigure(2)).list());

            System.out.println("Mural_3:\n" + mural_3.list());

            System.out.println("Mural_1:\n" + mural_1.list());

            System.out.println("Cloning figure 3 of mural 1...");
            AbstractFigure figure1 = mural_1.cloneMethod(2);
            System.out.println("Clone:\n" + figure1.list());

            System.out.print("Cloning figure 4 of mural 1...\n");
            AbstractFigure figure2 = mural_1.cloneMethod(3);
            System.out.println("Clone:\n" + figure2.list());
        } catch (InformationRequiredException exc) {
            System.err.println(exc.getInformationRequired());
        }
        try {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            System.out.println("Creating a rectangle...");
            Rectangle rectangle3_1 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(-6, -4), -34, -6, 0);
        } catch (InformationRequiredException exc) {
            System.err.println(exc.getInformationRequired());
        }
        try {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            System.out.println("Creating a circle...");
            Circle circle3_1 = (Circle) factory1.createFigure("Circle", identation1, null, 0, 0, -344);
        } catch (InformationRequiredException exc) {
            System.err.println(exc.getInformationRequired());
        }
        try {
            Thread.sleep(100);
            Mural mural_4 = new Mural("Mural 4", identation1);
            Rectangle rectangle4_1 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(4, 5), 44, 44, 0);
            Circle circle4_2 = (Circle) factory1.createFigure("Circle", identation1, new Coordinates(2, 3), 0, 0, 6);
            mural_4.addFigure(rectangle4_1);
            mural_4.addFigure(circle4_2);
            System.out.println("Creating...\n" + mural_4.list());
            Thread.sleep(100);
            Mural mural_5 = new Mural("Mural 5", identation1);
            Rectangle rectangle5_1 = (Rectangle) factory1.createFigure("Rectangle", identation1, new Coordinates(4, 5), 40, 50, 0);
            mural_5.addFigure(rectangle5_1);
            System.out.println("Creating...\n" + mural_5.list());

            System.out.println("Adding mural 5 in mural 4...");
            mural_4.addFigure(mural_5);
        } catch (InformationRequiredException exc) {
            System.err.println(exc.getInformationRequired());
        } catch (Exception e) {
        }
    }
}
