package templatemethod;

import templatemethod.Tea;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public class CaffeineBeverageDriver {

    public static void main(String[] args) {
        System.out.println("*********original tea***********");
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        System.out.println("*********original coffee**********");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("**************template model tea*******");
        templatemethod.optimisation.Tea tea = new templatemethod.optimisation.Tea();
        tea.prepareRecipe();
        System.out.println("**************template model coffee******");
        templatemethod.optimisation.Coffee coffee1 = new templatemethod.optimisation.Coffee();
        coffee1.prepareRecipe();
    }
}
