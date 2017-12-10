package cn.roc.designer.parttern.factory;

/**
 * @author Created by zhangp
 * @version 1.0.0
 * @desc
 * @time 2017/12/10
 */
public interface PizzaStore {
    /**
     * 制造pizza
     * @param name
     * @return
     */
    public Pizza createPizza(String name);
}
