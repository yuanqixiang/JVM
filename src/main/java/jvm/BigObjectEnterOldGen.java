package jvm;
/*
 * -XX:+PrintGCDetails -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 *
 * Eden:8M
 * From Survivor: 1M
 * To Survivor: 1M
 *
 * New Gen: 10M
 * Old Gen: 10M
 */
public class BigObjectEnterOldGen {
    private static final int _1M = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation3 = new byte[_1M];
        byte[] allocation1 = new byte[_1M * 4];
        byte[] allocation2 = new byte[_1M * 2];
    }
}
