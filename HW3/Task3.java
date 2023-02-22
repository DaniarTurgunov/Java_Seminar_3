package Seminar_3.HW3;
//Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
import Seminar_3.HW3.model.Books;
import java.util.ArrayList;
import java.util.List;
public class Task3 {
    public static void main(String[] args) {
        Books books = new Books("Книга 1","Киз",200,2008,800);
        Books books2 = new Books("Книга 2","Петров",300,2011,465);
        Books books3 = new Books("Книга 3","Иванов",250,2020,275);
        Books books4 = new Books("Книга 7","Аcт",800,2015,168);
        Books books5 = new Books("Книга 5","Курсов",750,2001,210);
        Books books6 = new Books("Книга 9","Анесли",1200,2010,300);
        List<Books> list = new ArrayList<>();
        list.add(books);
        list.add(books2);
        list.add(books3);
        list.add(books4);
        list.add(books5);
        list.add(books6);
        int search_n = 2010;
        String ssn = "А";
        List<Books> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getYear() >= search_n){
                newlist.add(list.get(i));
            }
        }
        for (int i = 0; i < newlist.size(); i++) {
            if (newlist.get(i).getSurname().toUpperCase().contains(ssn)) {
                System.out.println("name of book = " + newlist.get(i).getName());
            }
        }
    }
}
