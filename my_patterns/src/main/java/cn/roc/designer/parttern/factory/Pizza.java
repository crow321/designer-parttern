package cn.roc.designer.parttern.factory;

import cn.roc.designer.parttern.factory.ingredient.Cheese;
import cn.roc.designer.parttern.factory.ingredient.Clams;
import cn.roc.designer.parttern.factory.ingredient.Dough;
import cn.roc.designer.parttern.factory.ingredient.Pepperoni;
import cn.roc.designer.parttern.factory.ingredient.Sauce;
import cn.roc.designer.parttern.factory.ingredient.Veggies;

/**
 * @author Created by zhangp
 * @version 1.0.0
 * @time 2017/12/10
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    /**
     * 准备pizza
     */
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }
}
