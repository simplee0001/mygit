package com.sw.sufa;

public class TestBubArray {
    public static void main(String[] args) {
        BubArray array = new BubArray( );
        array.insert(90);
        array.insert(40);
        array.insert(60);
        array.insert(70);
        array.insert(940);
        array.insert(907);
        array.insert(906);
        array.insert(490);
        array.insert(690);
        array.insert(490);
        array.insert(690);
        array.insert(906);
        array.insert(9550);
        array.insert(906);
        array.insert(906);
        array.insert(950);
        array.insert(930);
        array.display();
        array.bubbelSort();
        array.display();
    }
}
