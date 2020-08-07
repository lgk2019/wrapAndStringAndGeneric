package com.lgk.generics;

import java.util.List;

/**
 * @author : lgk
 * @Description :
 * @ClassName : GoodsSeller
 * @date : 2020-8-7 0007
 **/
public class GoodsSeller {

    public void sellGoods(List< ? extends Goods> goods){
        //调用集合中的sell方法
        for (Goods g : goods){
            g.sell();
        }
    }
}