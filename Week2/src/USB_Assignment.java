import java.util.ArrayList;

public class USB_Assignment {
    public static void main(String[] args) {
        new USB_Assignment().new Test().test();
    }

    public interface USB {
        void turnOff();

        void turnOn();
    }

    public class Mouse implements USB {
        @Override
        public void turnOff() {
            System.out.println("叮咚,鼠标关闭了");
        }

        @Override
        public void turnOn() {
            System.out.println("叮咚,鼠标启动了");
        }
    }

    public class KeyBoard implements USB {
        @Override
        public void turnOff() {
            System.out.println("叮咚,键盘关机了");
        }

        @Override
        public void turnOn() {
            System.out.println("叮咚,键盘启动了");
        }
    }

    public class Microphone implements USB {
        @Override
        public void turnOff() {
            System.out.println("叮咚,麦克风关机了");
        }

        @Override
        public void turnOn() {
            System.out.println("叮咚,麦克风启动了");
        }
    }

    public class Computer {
        private ArrayList<USB> USBS = new ArrayList<>();

        void addUSB(USB usb) {
            USBS.add(usb);
        }

        public void powerOn() {
            for (USB sb : USBS)
                sb.turnOn();
            System.out.println("计算器启动成功!");
        }

        public void powerOff() {
            for (USB sb : USBS)
                sb.turnOff();
            System.out.println("计算器关闭成功!");
        }
    }

    private class Test {
        void test() {
            Computer computer = new Computer();
            computer.addUSB(new Mouse());
            computer.addUSB(new KeyBoard());
            computer.addUSB(new Microphone());
            computer.powerOn();
            System.out.println("==============================");
            computer.powerOff();
        }
    }
}