package day30Collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>();
        dq1.add("A");
        dq1.addFirst("B");
        dq1.addFirst("C");
        dq1.addLast("D");

        System.out.println(dq1); // [C, B, A, D]


    }


}
