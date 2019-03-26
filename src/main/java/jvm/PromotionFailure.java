package jvm;

/*
 *
 */
public class PromotionFailure {
    private static final int _1M = 1024 * 1024;
    public static void main(String[] args) {
        byte[] allocation1 = new byte[_1M * 14];
        byte[] allocation2 = new byte[_1M * 14];
        //byte[] allocation3 = new byte[_1M * 16];
        //allocation3 = null;
        //allocation3 = new  byte[_1M * 16];
    }
}
