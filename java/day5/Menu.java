package day5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        // Thêm các món vào menu
        menuItems.add(new MenuItem.Builder("Món 1", 10.0).description("Mô tả món 1").build());
        menuItems.add(new MenuItem.Builder("Món 2", 15.0).description("Mô tả món 2").build());
        menuItems.add(new MenuItem.Builder("Món 3", 20.0).description("Mô tả món 3").build());
        menuItems.add(new MenuItem.Builder("Món 4", 12.0).description("Mô tả món 4").build());
        menuItems.add(new MenuItem.Builder("Món 5", 18.0).description("Mô tả món 5").build());
        menuItems.add(new MenuItem.Builder("Món 6", 25.0).description("Mô tả món 6").build());
        menuItems.add(new MenuItem.Builder("Món 7", 30.0).description("Mô tả món 7").build());
        menuItems.add(new MenuItem.Builder("Món 8", 22.0).description("Mô tả món 8").build());
        menuItems.add(new MenuItem.Builder("Món 9", 28.0).description("Mô tả món 9").build());
        menuItems.add(new MenuItem.Builder("Món 10", 35.0).description("Mô tả món 10").build());
    }

    public void printMenu() {
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + ": " + item.getDescription() + " - " + item.getPrice() + " đồng");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
    }
}

