/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import controller.CountProgramming;
import model.Element;

/**
 *
 * @author quang
 */
public class Test {
    public static void main(String[] args) {
        Element element = new Element();
        Library lib  =new Library();
        
        element.setParagraph(lib.getString("Enter a paragraph: "));
        new CountProgramming(element).run();
    }
}
