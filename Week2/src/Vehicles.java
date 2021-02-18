public class Vehicles {
    public static void main(String[] args) {
        new Test().test();

    }

    private static class Test {
        private void test() {
            Vehicles v = new Vehicles();
            Car car = v.new Car("小汽车", 1150, 4, 6, 3);
            Truck truck = v.new Truck("大卡车", 15000, 8, 1, 3, 5000, 3000);
            car.showInfo();
            System.out.println("==============================================");
            truck.showInfo();
        }
    }

    class Vehicle {
        protected int weight, wheels;
        protected String name;

        public Vehicle(String name, int weight, int wheels) {
            this.name = name;
            this.weight = weight;
            this.wheels = wheels;
        }

        public void showInfo() {
            System.out.println("这是一辆" + name + ",车轮的个数是:" + wheels + ",车辆的重量是:" + weight);
        }
    }

    class Car extends Vehicle {
        protected int actual_Loader, plan_Loader;

        public Car(String name, int weight, int wheels, int actual_Loader, int plan_Loader) {
            super(name, weight, wheels);
            this.actual_Loader = actual_Loader;
            this.plan_Loader = plan_Loader;
        }

        public void showInfo() {
            super.showInfo();
            System.out.print("能载:" + plan_Loader + "人,实载" + actual_Loader + "人");
            if (plan_Loader < actual_Loader) System.out.println(",你超员了!");
            else System.out.println();
        }
    }

    class Truck extends Car {
        protected int actual_payload, plan_payload;

        public Truck(String name, int weight, int wheels, int actual_Loader, int plan_Loader, int actual_payload, int plan_payload) {
            super(name, weight, wheels, actual_Loader, plan_Loader);
            this.actual_payload = actual_payload;
            this.plan_payload = plan_payload;
        }

        public void showInfo() {
            super.showInfo();
            System.out.print("核载:" + plan_payload + "KG,实载" + actual_payload + "KG");
            if (plan_payload < actual_payload) System.out.println(",你超载了!");
            else System.out.println();
        }
    }
}