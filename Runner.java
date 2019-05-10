import by.gsu.pmslab.Drugstore;

import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Drugstore[] Drugstore = {
                new Drugstore("Kitty", true, 300.32f),
                new Drugstore("Molly", false, 1000.95f),
                new Drugstore("Kukky", true, 469.12f),
                new Drugstore("Lolly", false, 580.31f),
                new Drugstore("Lilly", true, 453.84f),
                new Drugstore("Gilly", false, 761.90f),
                new Drugstore("Siri", true, 567.01f),
                new Drugstore("Elly", false, 538.81f),
                new Drugstore("Health", false, 894.04f),
                new Drugstore("Foody", true, 785.48f)
        };
//Обычный вывод
        for (Drugstore i: Drugstore){
            System.out.println(i);
        }
//
        System.out.println("__________\n");

//Сортировка по месячной прибыли
        Arrays.sort(Drugstore, (o1, o2) -> Float.compare(o1.getMoney(), o2.getMoney()));
        for( Drugstore i: Drugstore){
            System.out.println(i);
        }
//
//Сортировка по названия аптек
        System.out.println("__________\n");
        Arrays.sort(Drugstore, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//
        for (Drugstore i : Drugstore){
            System.out.println(i);
        }
        float sum = 0;
        int value = 0;
        for (Drugstore i: Drugstore){
            sum += i.getMoney();
            if(!i.getLisen()){
                value +=1;
            }
        }
        System.out.println("Общая прибыль: "+ sum);
        System.out.println("Количество аптек без лицензии: " +value);
    }
}