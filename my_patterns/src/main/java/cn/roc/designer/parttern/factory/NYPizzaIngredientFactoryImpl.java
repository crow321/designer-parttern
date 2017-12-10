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
public class NYPizzaIngredientFactoryImpl implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClames() {
        return null;
    }
}
