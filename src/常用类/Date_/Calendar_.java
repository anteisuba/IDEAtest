package 常用类.Date_;/*
 *@author yang
 */

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //Calendar 是一个抽象类，并且构造器是private
        //可以通过getInstance()来获取实例
        //提供大量的方法和字段提供给程序员
        Calendar c = Calendar.getInstance();  //创建日历类对象
        System.out.println(c);

    }
}
