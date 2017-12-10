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
public interface PizzaIngredientFactory {
    /**
     * 制造面
     * @return
     */
    Dough createDough();

    /**
     * 制造酱油
     * @return
     */
    Sauce createSauce();

    /**
     * 制造奶酪
     * @return
     */
    Cheese createCheese();

    /**
     * 制造素食
     * @return
     */
    Veggies[] createVeggies();

    /**
     * 制造意大利香肠
     * @return
     */
    Pepperoni createPepperoni();

    /**
     * 制造蛤蚌
     * @return
     */
    Clams createClames();
}
