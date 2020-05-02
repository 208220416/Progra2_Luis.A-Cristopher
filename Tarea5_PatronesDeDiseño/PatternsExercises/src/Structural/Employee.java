package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To develop a flexible way to create hierarchical tree structures of arbitrary
 * complexity, while enabling every element in the structure to operate with a
 * uniform interface
 */
public class Employee implements AbstractEmployee{
    private String name;
    private Indentation indentation;

    public Employee(String name, Indentation indentation) {
        this.name = name;
        this.indentation = indentation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Indentation getIndentation() {
        return indentation;
    }

    public void setIndentation(Indentation indentation) {
        this.indentation = indentation;
    }

    @Override
    public String list() {
        return indentation.getSbIndent() + name + "\n";
    } 
}
