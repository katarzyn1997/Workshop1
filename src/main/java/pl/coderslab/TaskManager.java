package pl.coderslab;

import static pl.coderslab.ConsoleColors.*;

public class TaskManager {
    //
    static final String[] OPTION = {"add", "remove", "list", "exit"};

    public static void main(String[] args) {
        showAllUserOption(OPTION);
    }

    public static void showAllUserOption(String[] arr){
        System.out.println(BLUE + "Please select an option: " + RESET);
        for(String iterator:arr){
            System.out.println(iterator);
        }

    }
}


