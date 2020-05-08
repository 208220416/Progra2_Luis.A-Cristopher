package Exercise2;

/**
 * Class that allow to create a custom Exception
 *
 * @Version 1, 8 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class InformationRequiredException extends Exception {

    private String informationRequired;

    public InformationRequiredException(String informationRequired) {
        super(informationRequired);
        this.informationRequired = informationRequired;
    }

    public String getInformationRequired() {
        return informationRequired;
    }

}
