//编写一个银行账户类，类的构成包括：
//        数据成员：用户的账户名称、用户的账户余额;
//        方法包括：开户（设置账户名称及余额, 利用构造方法完成)；查询余额。

import java.util.Scanner;

class Cust {
    Scanner in = new Scanner(System.in);
    String name;
    int ID;
    int password;
    int money;

    Cust(String name, int ID, int password, int money) {
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.money = money;
    }

    public void Display() {
        System.out.println("账户:" + ID);
        System.out.println("姓名:" + name);
        System.out.println("余额:" + money);
    }

    public void takeMoney() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码进行验证！");
            int pass = sc.nextInt();
            if (pass == password) {
                System.out.println("请输入需要取款的金额！");
                int withdrawals = sc.nextInt();
                if (withdrawals <= money) {
                    money = money - withdrawals;
                    System.out.println("账户余额" + money);
                } else {
                    System.out.println("当前余额不足！");
                }
                break;
            } else {
                System.out.println("你输入的密码有误，请重新输入！");
            }
            sc.close();
        }
    }

    public void saveMoney(int inmoney) {
        money = money + inmoney;
        System.out.println("此次存款为:" + inmoney);
        System.out.println("账户余额:" + money);
    }
}