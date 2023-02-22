package Seminar_3.HW2;
import Seminar_3.HW1.model.Items;
import Seminar_3.HW2.model.Tovar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("шоколад","USA",10,300, 1);
        Tovar tovar2 = new Tovar("пряник","Russia",20,600,2);
        Tovar tovar3 = new Tovar("снеки","China",30,900,1);
        Tovar tovar4 = new Tovar("сыр","Switzerland",50,400,2);
        List<Tovar> list = new ArrayList<>();
        list.add(tovar);
        list.add(tovar2);
        list.add(tovar3);
        list.add(tovar4);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Tovar> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSort().equals(n)){
                newlist.add(list.get(i));
            }
        }
        int min_p = newlist.get(0).getPrice();
        for (int i = 0; i < newlist.size(); i++) {
            if(newlist.get(i).getPrice() < min_p){
                min_p = newlist.get(i).getPrice();
            }
        }
        scanner.close();
        System.out.println("Сорт = " + n + ", мин цена = " + min_p);
    }
}
