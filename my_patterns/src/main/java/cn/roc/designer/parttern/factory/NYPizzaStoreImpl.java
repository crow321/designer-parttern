package cn.roc.designer.parttern.factory;

import cn.roc.designer.parttern.factory.pizza.CheesePizzaImpl;

/**
 * @author Created by zhangp
 * @version 1.0.0
 * @desc 纽约披萨店
 * @time 2017/12/10
 */
public class NYPizzaStoreImpl implements PizzaStore {
    private static final String PIZZA_TYPE_CHEESE = "cheese";


    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactoryImpl();
        if (PIZZA_TYPE_CHEESE.equals(item)) {
            pizza = new CheesePizzaImpl(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else {
            //other todo
        }
        return pizza;
    }
}
