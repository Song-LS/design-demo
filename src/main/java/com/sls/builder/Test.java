package com.sls.builder;

/**
 * 建造者模式
 * @author sls
 **/
public class Test {
    public static void main(String[] args) {
        Custom custom = Custom.builder().age(11).address("上海").build();
        System.out.println(custom.toString());
    }
}
