package projects.BankProject;

import static projects.BankProject.CustomerServices.defaultCustomer;
import static projects.BankProject.Menus.registerMenu;

public class Runner {
    public static void main(String[] args) {
        defaultCustomer();
        registerMenu();
    }
}
