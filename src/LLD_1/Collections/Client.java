package LLD_1.Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // doesn't follows order
        set.add(10);
        set.add(15);
        set.add(8);
        set.add(22);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>(); // follows order
        set1.add(11);
        set1.add(12);
        set1.add(82);
        set1.add(29);
        set1.add(11); // 11 is already added , takes unique
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>(); // follows order
        set2.add(11);
        set2.add(12);
        set2.add(82);
        set2.remove(11);
        set2.add(29);
        set2.add(11);
        System.out.println(set2);


        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        System.out.println(stack); // op: 5,6,7,8 because its implemented using vector

        stack.add(2,100);
        System.out.println(stack);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(8);
        System.out.println(treeSet);


    }
}
