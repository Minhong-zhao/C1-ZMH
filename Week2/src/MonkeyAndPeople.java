public class MonkeyAndPeople {
    public static void main(String[] args) {
        MonkeyAndPeople temp = new MonkeyAndPeople();
        Monkey monkey = temp.new Monkey("阿巴阿巴...");
        People poeple = temp.new People("不错嘛,还会说话了", "别说话！认真思考！");
        monkey.speak();
        poeple.speak();
        poeple.think();
    }

    public class Monkey {
        protected String say;//说的内容
        protected String name;

        Monkey(String say) {
            this.name = "猴子";
            this.say = say;
        }

        void speak() {
            System.out.print(name + ":");
            System.out.println(say);
        }
    }

    public class People extends Monkey {
        protected String th;//思考的内容

        People(String say, String th) {
            super(say);
            this.name = "人";
            this.th = th;
        }

        private void think() {
            System.out.println(name + ":" + th);
        }
    }
}