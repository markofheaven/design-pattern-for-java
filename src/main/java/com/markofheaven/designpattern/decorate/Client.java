package com.markofheaven.designpattern.decorate;

/**
 * 转载链接https://www.jianshu.com/p/d7f20ae63186
 * 至少我是一下子就看懂装饰模式是怎么一回事了
 */
public class Client {
    public static void main(String[] args){
        GreatSageEquallingHeaven sage = new Monkey();
        GreatSageEquallingHeaven bird = new Bird(sage);
        bird.move();

        GreatSageEquallingHeaven fish = new Fish(bird);
        fish.move();
    }
}
