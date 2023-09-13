/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import java.util.HashMap;
import model.Element;
import view.Menu;

/**
 *
 * @author quang
 */
public class CountProgramming extends Menu<String> {

    static String options[] = {"Count Letter", "Count Character"};
    protected Library lib;
    protected Algorithm algorithm;
    protected String paragraph;

    public CountProgramming(Element element) {
        super("COUNTING ALGORITHM", options);
        lib = new Library();
        algorithm = new Algorithm();
        paragraph = element.getParagraph();
    }

    @Override
    public void excute(int n) {
        System.out.print("Paragraph: " + paragraph);
        HashMap<String, Integer> map = new HashMap<>();
        switch (n) {
            case 1:
                map = algorithm.countLetter(paragraph);
                System.out.println("\n--------------------");
                for (String key : map.keySet()) {
                    System.out.println(key + " : " + map.get(key));
                }
                System.out.println("--------------------");
                break;
            case 2:
                map = algorithm.countCharacter(paragraph);
                System.out.println("\n--------------------");
                for (String key : map.keySet()) {
                    System.out.println(key + " : " + map.get(key));
                }
                System.out.println("--------------------");
                break;
        }
    }

}


/*
- Khởi tạo git
git init
- Tạo nhánh
git checkout -b develop
- Kiểm tra trạng thái
git status
- Thêm tất cả các file
git add .
- Commit lần chuẩn bị để đẩy code
git commit -m "nội  dung"
- Kiểm tra đã remote chưa
git remote -v
- Thực hiện việc add remote
git remote add origin git@.....
- Đẩy code
git push origin develop


 */
