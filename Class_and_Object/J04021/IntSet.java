package Class_and_Object.J04021;

import java.util.*;

public class IntSet {
    private final int[] arr;

    public IntSet(int[] arr) {
        this.arr = arr;
    }

    public IntSet union(IntSet o) {
        TreeSet<Integer> mySet = new TreeSet<>();
        for (int i : arr)
            mySet.add(i);
        for (int i : o.arr)
            mySet.add(i);
        return new IntSet(mySet.stream().mapToInt(Integer::intValue).toArray());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i : arr)
            res.append(i).append(" ");
        return res.toString();
    }
}
