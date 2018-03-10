package io.netty.example.buffer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: MuYa
 * @Date : 2018/3/9
 * @Time : 17:25
 * @Description:
 */
public class TreeDemo {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Hashtable hashtable = new Hashtable();

        Integer[] integers = {1, 4, 6, 7, 5};
        for (int i = 0; i < integers.length; i++) {
            treeSet.add(integers[i]);
            arrayList.add(integers[i]);
        }

        for (Integer intTemp : arrayList) {
            System.out.println("arrayList: " + intTemp);
        }

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println("treeSet: " + iterator.next());

        }

    }
}
