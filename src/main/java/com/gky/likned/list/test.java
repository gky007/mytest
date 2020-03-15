package com.gky.likned.list;

import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("a","b","c","d","a");
        System.out.println("原数 " + word.toString());
        System.out.println("---------方法1------------");
        Set<String> set = new HashSet<>();
        for (String list : word) {
            set.add(list);
        }
        set.forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println("----------方法2-----------");
        word.stream(). // 转换成流
                distinct(). // 去重
                collect(Collectors.toList()). // 装换成List集合
                forEach(a -> System.out.print(a + " ") );   // 循环遍历输出
    }
}
