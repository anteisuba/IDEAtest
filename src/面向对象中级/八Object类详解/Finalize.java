package 面向对象中级.八Object类详解;

public class Finalize {
    public static void main(String[] args) {
        Car baoma = new Car("baoma");
        //程序员可以在finalize中，写自己的业务逻辑代码
        //如果程序员不重写finalize，那么就会调用Object类的finalize，即默认处理
        //如果程序员重写了finalize，就可以实现自己的逻辑

        baoma = null; //这是Car对象是一个垃圾，没有任何引用，垃圾回收器就会回收（销毁）
        System.gc(); //主动调用垃圾回收器
        System.out.println("程序退出了");


    }
}
class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + name);
        System.out.println("释放了资源");
    }
}
