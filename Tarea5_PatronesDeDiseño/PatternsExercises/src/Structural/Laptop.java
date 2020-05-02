/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public class Laptop implements Sellable {

    private String description;
    private int price;

    public Laptop() {
    }

    public Laptop(String description, int price) {
        this.description = description + "\nBasic components: Hard drive, RAM, Video Card"
                + ", Motherboard, External structure\nExtra components:";
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
