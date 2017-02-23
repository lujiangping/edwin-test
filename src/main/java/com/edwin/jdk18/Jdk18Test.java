package com.edwin.jdk18;

import com.edwin.domain.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author edwin.lu 2017/2/23.
 */
public class Jdk18Test {

    public static void main(String[] args) {
        List<Integer> idList = Lists.newArrayList();
        idList.add(1);
        idList.add(3);
        idList.add(2);
        idList.add(4);

        Collections.sort(idList, Integer::compareTo);

        for (Integer integer : idList) {
            System.out.println(integer);
        }

        List<String> stringList = Lists.newArrayList();
        stringList.add("a");
        stringList.add("d");
        stringList.add("e");
        stringList.add("c");
        Collections.sort(stringList, String::compareTo);

        stringList.forEach(System.out::println);

        List<User> userList = Lists.newArrayList();
        userList.add(new User(1, "aa", 15));
        userList.add(new User(2, "bb", 12));
        userList.add(new User(3, "cc", 16));

        Collections.sort(userList, (a, b) -> a.getAge() - b.getAge());

        userList.forEach((user -> System.out.println(user.getAge())));


        Map<Integer, User> userMap = Maps.newHashMap();
        userList.forEach(user -> {
            System.out.println(user.getId());
            userMap.put(user.getId(), user);
        });

    }

}
