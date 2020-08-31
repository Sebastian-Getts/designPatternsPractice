package templatemethod;

/**
 * 煮咖啡
 *
 * @author sebastian
 * @date 2020/8/31
 */
public class Coffee {

    /**
     * 实现了煮咖啡的每个步骤
     */
    void prepareRecipe() {
        biolWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void biolWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
