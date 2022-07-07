package schoool.management.system;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=e0X00EoFQbE
public class Main {
    public static void main(String[] args){
        //Array list
/*
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(45);
        numbers.add(9);
        numbers.add(2,10);

        System.out.println(numbers);
*/
        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher Melissa = new Teacher(2,"Melissa",700);
        Teacher Vanderhorn = new Teacher(3,"Vanderhorn",600);

        Student Alexica = new Student(1,"Alex",20);
        Student David = new Student(2,"David",14);

    }
}
