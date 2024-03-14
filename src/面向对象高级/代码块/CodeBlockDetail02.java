package 面向对象高级.代码块;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        //先静态 后普通 再构造器
        A a = new A(); //(1) A 静态代码块01 （2）getN1被调用  （3）getN2被调用 （4）普通代码块

    }
}

class A {

    private int n2 = getN2(); //普通属性的初始化，在前面的先执行

    { //普通代码块
        System.out.println("A的普通代码块");
    }

    //静态属性的初始化
    static {  //静态代码块
        System.out.println("A 静态代码块");
    }
    private static int n1 = getN1();
    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    public A() {
        System.out.println("A（）无参构造器被调用");
    }
}
