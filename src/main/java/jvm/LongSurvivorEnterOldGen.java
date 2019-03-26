package jvm;

/*
 * -XX:+PrintGCDetails -Xms80M -Xmx80M -Xmn40M -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 */
public class LongSurvivorEnterOldGen {
    private static final int _1M = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1 = new byte[_1M];
        byte[] allocation2 = new byte[_1M * 16];
        byte[] allocation3 = new byte[_1M * 16];
        allocation3 = null;
        allocation3 = new  byte[_1M * 16];
    }
}
