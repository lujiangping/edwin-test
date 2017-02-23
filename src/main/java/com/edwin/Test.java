package com.edwin;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author edwin.lu 2017/2/22.
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2);
        list.add("1");
        list.add("2");
        String[] array = new String[list.size()];
        array = list.toArray(array);
        String join = Joiner.on(",").join(array);
        System.out.println(join);
    }
}
