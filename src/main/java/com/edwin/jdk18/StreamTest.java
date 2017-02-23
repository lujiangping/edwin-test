package com.edwin.jdk18;

import com.edwin.domain.User;
import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author edwin.lu 2017/2/23.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> numList = Lists.newArrayList();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(4);
        numList.add(5);

        List<Integer> collect = numList.stream().filter(num -> num % 2 == 0).distinct().sorted((a, b) -> b.compareTo(a)).limit(1).collect(Collectors.toList());
        collect.forEach(System.out::println);

        List<User> userList = Lists.newArrayList();
        userList.add(new User(1, "aa", 15));
        userList.add(new User(2, "bb", 12));
        userList.add(new User(3, "cc", 16));
        List<User> users = userList.stream().filter(user -> user.getAge() == 12).collect(Collectors.toList());

        List<String> userNames = userList.stream().map(User::getUserName).collect(Collectors.toList());
        userNames.forEach(System.out::println);

        int sum = userList.stream().mapToInt(User::getAge).sum();
        System.out.println("年龄总和：" + sum);

        boolean allMatch = userList.stream().allMatch(user -> user.getAge() > 14);
        System.out.println(allMatch);

        boolean anyMatch = userList.stream().anyMatch(user -> user.getAge() > 15);
        System.out.println(anyMatch);

        boolean noneMatch = userList.stream().noneMatch(user -> user.getAge() > 19);
        System.out.println(noneMatch);

        Optional<User> first = userList.stream().filter(user -> user.getAge() > 15).findFirst();
        boolean present = first.isPresent();
        System.out.println(present);

        Integer reduce = userList.stream().map(User::getAge).reduce(0, (a, b) -> a + b);
        Integer reduce1 = userList.stream().map(User::getAge).reduce(0, Integer::sum);
        Optional<Integer> reduce2 = userList.stream().map(User::getAge).reduce(Integer::sum);

        System.out.println(reduce + "、" + reduce1 + "、" + reduce2.get());

        long count = userList.stream().count();
        System.out.println("总人数：" + count);

        String collect1 = userList.stream().map(User::getUserName).collect(Collectors.joining(","));
        System.out.println(collect1);

        Optional<User> min = userList.stream().collect(Collectors.minBy(Comparator.comparing(User::getAge)));
        System.out.println(min.get().getUserName());
        Optional<User> max = userList.stream().collect(Collectors.maxBy(Comparator.comparing(User::getAge)));
        System.out.println(max.get().getUserName());

    }

}
