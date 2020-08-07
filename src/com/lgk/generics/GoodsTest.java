package com.lgk.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lgk
 * @Description :主方法
 * @ClassName : GoodsTest
 * @date : 2020-8-7 0007
 **/
public class GoodsTest {

    public static void main(String[] args) {
        //定义book相关的List
        List<Books> booksList = new ArrayList<Books>();
        booksList.add(new Books());
        booksList.add(new Books());
        //定义clothes相关的List
        List<Clothes> clothesList = new ArrayList<>();
        clothesList.add(new Clothes());
        clothesList.add(new Clothes());
        //定义shose相关的List
        List<Shose> shoseList = new ArrayList<>();
        shoseList.add(new Shose());
        shoseList.add(new Shose());

        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(booksList);
    }
}