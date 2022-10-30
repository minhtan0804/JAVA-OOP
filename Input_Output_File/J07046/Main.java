package Input_Output_File.J07046;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07046\\KHACH.in"));
        Scanner sc = new Scanner(new File("KHACH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Guest> guestArrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Guest guest = new Guest(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            guestArrayList.add(guest);
        }

        Collections.sort(guestArrayList);

        for (Guest guest : guestArrayList)
            System.out.println(guest);
    }
}
