package Array.J02033;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int idx = 0;
        while(a[idx] < 0 && idx < n && k-- > 0) {
            a[idx] *= -1;
            ++idx;
        }
        if(k > 0 && ((k & 1) == 1)) {
            int MIN = (int) 1e6;
            idx = 0;
            for(int i = 0; i < n; ++i)
                if(a[i] < MIN) {
                    MIN = a[i];
                    idx = i;
                }
            a[idx] *= -1;
        }
        long Sum = 0;
        for(int i : a)
            Sum += i;
        
        System.out.print(Sum);
    }
}
