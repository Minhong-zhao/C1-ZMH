public class Universe {
    public static void main(String[] args) {
        new Test().test();

    }

    public interface UNIVERSE {
        void doAnything();
    }

    private static class Test {
        void test() {
            Universe u = new Universe();
            Star star = u.new Star();
            star.shine();
            Star sun = u.new Sun();
            sun.shine();
            ((UNIVERSE) sun).doAnything();
        }

    }

    public class Star {

        public void shine() {
            System.out.println("一闪一闪亮晶晶");
        }

    }

    public class Sun extends Star implements UNIVERSE {

        public void shine() {
            System.out.println("太阳照耀着大地!");
        }

        @Override
        public void doAnything() {
            System.out.println("太阳吸引着九大行星");
        }
    }
}