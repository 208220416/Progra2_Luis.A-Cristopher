package Exercise1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class are used to create clients
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Client implements Observer {

    private String id;
    private String email;
    private ArrayList<StatusEnum> packageStatusList;

    public Client(String id, String email) {
        this.id = id;
        this.email = email;
        packageStatusList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void updateInformation(Purchase purchase) {
        packageStatusList.add(purchase.getStatus().getDescription());
    }

    @Override
    public String showInformation() {
        Iterator iterator = packageStatusList.iterator();
        String text = "";
        while (iterator.hasNext()) {
            text += iterator.next() + ", ";
        }
        return text;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", email=" + email + '}';
    }

}
