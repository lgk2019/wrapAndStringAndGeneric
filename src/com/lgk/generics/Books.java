package com.lgk.generics;

/**
 * @author : lgk
 * @Description :
 * @ClassName : Books
 * @date : 2020-8-7 0007
 **/
public class Books extends Goods {
    @Override
    public void sell() {
        System.out.println("sell books!");
    }
}