package iteratorcomposite;

import java.util.ArrayList;

/**
 * @author sebastian
 * @date 7/5/20 2:13 AM
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

        System.out.println("===================traditional==================");
        traditional();
    }

    /**
     * 由于两家餐厅内部的实现不同（一个用线性表，另一个用数组），所以遍历的方式不同。重复编写，麻烦。
     */
    public static void traditional() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        MenuItems[] menuItems = dinerMenu.getMenuItems();
        for (MenuItems menuItem : menuItems) {
            if (menuItem != null) {
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.isVegetarian() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }

        System.out.println("================================================");
        ArrayList<MenuItems> menuItems1 = pancakeHouseMenu.getMenuItems();
        for (MenuItems menuItem : menuItems1) {
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.isVegetarian() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
