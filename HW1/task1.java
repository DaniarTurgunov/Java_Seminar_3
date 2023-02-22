package Seminar_3.HW1;

import Seminar_3.HW1.model.Items;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class task1 {
    public static void main(String[] args) {
        Items items = new Items("первый",100,2);
        Items items2 = new Items("высший",300,1);
        Items items3 = new Items("второй",200,2);
        Items items4 = new Items("высший",400,2);
        Items items5 = new Items("высший",600,1);
        Items items6 = new Items("высший",900,2);
        List<Items> list = new ArrayList<>();
        list.add(items);
        list.add(items2);
        list.add(items3);
        list.add(items4);
        list.add(items5);
        list.add(items6);
        String searchName = "высший";
        List<Items> newList= new ArrayList<>();
        int price_max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(searchName)) {
                newList.add(list.get(i));
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).getPrice() > price_max) {
                price_max = newList.get(i).getPrice();
            }
        }
        System.out.println("Макс значение =" + price_max);
    }
}
