package templatemethod;

import java.util.Arrays;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10)
        };
        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting: ");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
