package com.sparta.springcore;

public class Test {

    public int addNum(int x,int y,int z) {
        return x + y + z;
    }


    public static void main(String[] args) {
        Test t = new Test();
        int sumNum =t.addNum(1,2,3);
        System.out.println(sumNum);
    }
}
