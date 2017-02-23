package com.edwin.jdk18;

import java.util.Optional;

/**
 * @author edwin.lu 2017/2/23.
 */
public class OptionalTest {

    public static void main(String[] args) {
        String str = "adafdfa";
        Integer length = Optional.of(str).map(String::length).orElse(0);
        System.out.println(length);

    }

}
