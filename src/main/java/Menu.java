class MenuObjects {
    String[] menuOptions = {
            "View database",
            "Add new item",
            "Delete item",
            "Quit program"
    };

    int j = 0;

    /*
    void display() {

    System.out.println("Choose an option:");

    for (int i = 0; i < menuOptions.length; i++) {
                       j = i+1;
        System.out.println(j + ". " + menuOptions[i]);
    }
    */
    String get() {
        String menuText = "Choose an option:\n";

        for (int i = 0; i < menuOptions.length; i++) {
            j= i + 1;
            menuText += "\n" + j + ". " + menuOptions[i];

            // menuText += String.format("%d. %s\n", j, menuOption[i]);
            }
        return menuText;
        }
    }
public class Menu {

    public static void main(String[] args) {
        MenuObjects object1 = new MenuObjects();
        String menuText = object1.get();

        System.out.println(menuText);


    }
}
