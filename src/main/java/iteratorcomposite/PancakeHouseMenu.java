package iteratorcomposite;

import java.util.ArrayList;

/**
 * 使用了组合的设计模式： PancakeHouseMenu & MenuItems
 *
 * @author sebastian
 * @date 7/5/20 1:13 AM
 */
public class PancakeHouseMenu {
    ArrayList<MenuItems> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItems menuItem = new MenuItems(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * deprecated when implementing iterator interface
     *
     * @return arrayList of menu items
     */
    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
