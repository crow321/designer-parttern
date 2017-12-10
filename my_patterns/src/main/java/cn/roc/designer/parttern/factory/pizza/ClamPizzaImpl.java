package cn.roc.designer.parttern.factory.pizza;

import cn.roc.designer.parttern.factory.Pizza;
import cn.roc.designer.parttern.factory.PizzaIngredientFactory;

/**
 * 蛤蜊披萨
 * @author Created by zhangp
 * @version 1.0.0
 * @time 2017/12/10
 */
public class ClamPizzaImpl extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizzaImpl(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClames();
    }
}
