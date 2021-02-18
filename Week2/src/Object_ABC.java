public class Object_ABC {
    public static void main(String[] args) {
        Object_ABC object = new Object_ABC();
        C c = object.new C();
        c.showA();
        c.showB();
        c.showC();
    }

    public abstract class A {
        protected int numA;

        A() {
            this.numA = 10;
        }

        public abstract void showA();
    }

    public abstract class B extends A {
        protected int numB;

        B() {
            super();
            this.numB = 20;
        }

        public abstract void showB();
    }

    public class C extends B {
        protected int numC;

        C() {
            super();
            this.numC = 30;
        }

        @Override
        public void showA() {
            System.out.println("A=" + numA);
        }

        @Override
        public void showB() {
            System.out.println("B=" + numB);
        }

        public void showC() {
            System.out.println("C=" + numC);
        }
    }
}