package cn.roc.designer.parttern.factory.pizza;

import cn.roc.designer.parttern.factory.Pizza;
import cn.roc.designer.parttern.factory.PizzaIngredientFactory;

/**
 * 芝士披萨
 * @author Created by zhangp
 * @version 1.0.0
 * @time 2017/12/10
 */
public class CheesePizzaImpl extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizzaImpl(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
