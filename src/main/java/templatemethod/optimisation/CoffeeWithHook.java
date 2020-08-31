package templatemethod.optimisation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public class CoffeeWithHook extends AbstractCaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * 覆盖了父类的方法，提供了自己的实现
     *
     * @return boolean
     */
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = n.readLine();
        } catch (IOException ioException) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
