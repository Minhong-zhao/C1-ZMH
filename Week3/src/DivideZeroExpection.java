public class DivideZeroExpection {
    public static void main(String[] args) throws Exception {
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            throw new DivideZeroExpection().new TCPException("发生了除0错误");
        }
    }

    public class TCPException extends Exception {
        public TCPException() {
        }

        public TCPException(String s) {
            super(s);
        }
    }
}