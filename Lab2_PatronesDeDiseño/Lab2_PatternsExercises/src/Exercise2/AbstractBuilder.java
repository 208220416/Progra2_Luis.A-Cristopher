package Exercise2;

/**
 * Interface that define the general methods that contain a figures constructor
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public interface AbstractBuilder {

    /**
     * Method that build the instance of the figure empty
     */
    public void buildFigure();

    /**
     * Method that build the name of the figure
     *
     * @param name, the name of the figure assigned
     */
    public void buildName(String name);

    /**
     * Method that build the identation of the figure
     *
     * @param identation, the identation of the figure assigned
     */
    public void buildIdentation(Identation identation);

    /**
     * Method that get the figure and valid that information is correct
     *
     * @return the instance of the figure
     * @throws InformationRequiredException
     */
    public Figure getFigure() throws InformationRequiredException;

}
