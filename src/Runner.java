import by.gsu.pmslab.*;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 3;
        final String FILE_NAME = "drugstore.dat";

        Drugstore[] drugstores = new Drugstore[ARRAY_SIZE];



        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME)); Scanner in = new Scanner(System.in)){
            int i;
            for (i = 0; i < ARRAY_SIZE; i++){

                System.out.print("Input name: ");
                String name = in.next();
                System.out.print("Input pay: ");
                int money = in.nextInt();
                System.out.print("Drugstore have licen?: ");
                boolean haveLicen = in.nextBoolean();
                oos.writeObject(new Drugstore(name, money, haveLicen));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            for (int i = 0; i < ARRAY_SIZE; i++){
                drugstores[i] = (Drugstore) ois.readObject();
            }
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println("____________________________");
        System.out.println("\tInit array:");
        System.out.println("____________________________");
        show(drugstores);
        System.out.println("____________________________");

        Arrays.sort(drugstores, new Comparator<Drugstore>() {
            @Override
            public int compare(Drugstore o1, Drugstore o2) {
                return o1.getMoney() - o2.getMoney();
            }
        });
        System.out.println("____________________________");
        System.out.println("\tSort by money:");
        System.out.println("____________________________");
        show(drugstores);
        System.out.println("____________________________");

        Arrays.sort(drugstores, new Comparator<Drugstore>() {
            @Override
            public int compare(Drugstore o1, Drugstore o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("____________________________");
        System.out.println("\tSort by name:");
        System.out.println("____________________________");
        show(drugstores);
        System.out.println("____________________________");

        int sum=+countMoney(drugstores);
        int avg=sum/drugstores.length;

        System.out.println("\tAverange money = "+ Byn.toBYN(avg));

        System.out.println("\tDrugstores without licen = "+countChild(drugstores));
    }

    private static void show(Drugstore[] array){
        for (Drugstore item : array){
            System.out.println(item);
        }
    }
    private static int countMoney(Drugstore[] array){
        int money = 0;
        for (Drugstore item : array){
            money += item.getMoney();
        }
        return money;
    }
    private static int countChild(Drugstore[] array){
        int num = 0;
        for (Drugstore item : array){
            if (!item.isHaveLicen()){
                num++;
            }
        }
        return num;
    }
}