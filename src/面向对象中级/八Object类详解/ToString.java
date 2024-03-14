package 面向对象中级.八Object类详解;

public class ToString {
    public static void main(String[] args) {
        /*
        * Object的toString()源码
        * getClass().getName()类的全类名（包名+类名）
        * toHexString 转成16进制
        * public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
          }
        * */
        Monster monster = new Monster("小妖怪","巡山的",1000);
        System.out.println(monster.toString() + "hashcode=" + monster.hashCode());
        //当直接输出一个对象时，toString方法会被默认的调用
        System.out.println(monster); //等价monster.toString
    }
}

class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    //重写toString方法，输出对象的属性
    //使用快捷键即可


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }


}
