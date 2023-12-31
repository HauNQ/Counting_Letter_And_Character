/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import java.util.ArrayList;

/**
 *
 * @author quang
 */
public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> options = new ArrayList<>();
    Library lib = new Library();

    public Menu() {
    }

    public Menu(String title, T[] arr) {
        this.title = title;

        for (T t : arr) {
            options.add(t);
        }
    }

    public void display() {
        System.out.println("\n"+title);
        System.out.println("-----------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println((options.size() + 1) + ". Exit");
        System.out.println("-----------------------");
    }

    public int getOption() {
        display();
        return lib.getInt("Enter your selection", 1, options.size() + 1);
    }

    public abstract void excute(int n);

    public void run() {
        while (true) {
            int n = getOption();
             if (n > options.size()) {
                 System.out.println("GoodBye");
                break;
            }
            excute(n);
        }
    }

}
