package Array.J02013;

import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int test = 1;
        for (int i = 0; i < n - 1; i++) {
            boolean haveSwap = false;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    haveSwap = true;
                }
            }

            if (haveSwap == false) {
                break;
            }

            System.out.print("Buoc " + test++ + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
