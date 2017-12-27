package lesson3;

public class Transformation {
    public static void main(String[] args) {
        System.out.println(transformFromByteToShort((byte) 15, (short) 1124));
        System.out.println(transformFromByteToInt((byte) 45, 666));
        System.out.println(transformFromByteToChar((byte) 79, (char) '\u1245'));
        System.out.println(transformFromByteToLong((byte) 36, 145));
        System.out.println(tranformFromByteToFloat((byte) 14, (float) 34.53f));
        System.out.println(transformFromByteToDouble((byte) 16, (double) 11.45));
        System.out.println(transformFromShortToByte((short) 54, (byte) 111));
        System.out.println(tranformFromShortToChar((short) 122, (char) '\u1233'));
        System.out.println(transformFromShortToInt((short) 124, 1255));
        System.out.println(transformFromShortToLong((short) 155, 123));
        System.out.println(transformFromShortToFloat((short) 126, (float) 35.11f));
        System.out.println(transformFromShortToDouble((short) 44, (double) 44.11));
        System.out.println(transformFromCharToByte((char) 144, (byte) 9));
        System.out.println(transformFromCharToShort((char) 111, (short) 1));
        System.out.println(transformFromCharToInt((char) 12, 1125));
        System.out.println(transformFromCharToLong((char) 116, 22));
        System.out.println(transformFromCharToFloat((char) 87, 12.55f));
        System.out.println(transformFromCharToDouble((char) 54, 11.75));
        System.out.println(transformFromIntToByte(1111, (byte) 1));
        System.out.println(transformFromIntToShort(123, (short) 11));
        System.out.println(transformFromIntToChar(112, (char) 1222));
        System.out.println(transformFromIntToLong(122, 112));
        System.out.println(transformFromIntToFloat(115, 122.11f));
        System.out.println(transformFromIntToDouble(3355, 122.5));
        System.out.println(transformFromLongToByte((long) 122, (byte) 155));
        System.out.println(transformFromLongToShort((long) 544, (short) 611));
        System.out.println(transformFromLongToChar((long) 615, (char) 412));
        System.out.println(transformFromLongToInt((long) 977, (int) 12));
        System.out.println(transformFromLongToFloat(112, 15.65f));
        System.out.println(transformFromLongToDouble(511, 755));
        System.out.println(transformFromFloatToByte(122.44f, (byte) 122));
        System.out.println(transformFromFloatToShort(666.22f, (short) 12));
        System.out.println(transformFromFloatToChar(12.66f, (char) 166));
        System.out.println(transformFromFloatToInt(885.11f, 12));
        System.out.println(transformFromFloatToLong(122.55f, 611));
        System.out.println(transformFromFloatToDouble(67.12f, 12.11));
        System.out.println(transformFromDoubleToByte(11.55, (byte) 65));
        System.out.println(transformFromDoubleToShort(12.11, (short) 654));
        System.out.println(transformFromDoubleToChar(122.55, (char) 177));
        System.out.println(transformFromDoubleToInt(224.15, 155));
        System.out.println(transformFromDoubleToLong(766.12, 511));
        System.out.println(transformFromDoubleToFloat(166.12, 766.122f));
    }

    public static short transformFromByteToShort(byte b, short s) {
        s = b;
        return s;
    }

    public static char transformFromByteToChar(byte b1, char c1) {
        c1 = (char) b1;
        return c1;
    }

    public static int transformFromByteToInt(byte b2, int i1) {
        i1 = b2;
        return i1;
    }

    public static long transformFromByteToLong(byte b3, long l1) {
        l1 = b3;
        return l1;
    }

    public static float tranformFromByteToFloat(byte b4, float f1) {
        f1 = (float) b4;
        return f1;
    }

    public static double transformFromByteToDouble(byte b5, double d1) {
        d1 = (double) b5;
        return d1;
    }

    public static byte transformFromShortToByte(short s1, byte b4) {
        b4 = (byte) s1;
        return b4;
    }

    public static char tranformFromShortToChar(short s2, char c2) {
        c2 = (char) s2;
        return c2;
    }

    public static int transformFromShortToInt(short s2, int i2) {
        i2 = s2;
        return i2;
    }

    public static long transformFromShortToLong(short s3, long l2) {
        l2 = s3;
        return l2;
    }

    public static float transformFromShortToFloat(short s4, float f2) {
        f2 = (float) s4;
        return f2;
    }

    public static double transformFromShortToDouble(short s5, double d2) {
        d2 = (double) s5;
        return d2;
    }

    public static byte transformFromCharToByte(char c3, byte b1) {
        b1 = (byte) c3;
        return b1;
    }

    public static short transformFromCharToShort(char c1, short s1) {
        s1 = (short) c1;
        return s1;
    }

    public static int transformFromCharToInt(char c1, int i1) {
        i1 = c1;
        return i1;
    }

    public static long transformFromCharToLong(char c1, long l1) {
        l1 = c1;
        return l1;
    }

    public static float transformFromCharToFloat(char c1, float f1) {
        f1 = c1;
        return f1;
    }

    public static double transformFromCharToDouble(char c1, double d1) {
        d1 = c1;
        return d1;
    }

    public static byte transformFromIntToByte(int i1, byte b1) {
        b1 = (byte) i1;
        return b1;
    }

    public static short transformFromIntToShort(int i1, short s1) {
        s1 = (short) i1;
        return s1;
    }

    public static char transformFromIntToChar(int i1, char c1) {
        c1 = (char) i1;
        return c1;
    }

    public static long transformFromIntToLong(int i1, long l1) {
        l1 = i1;
        return l1;
    }

    public static float transformFromIntToFloat(int i1, float f1) {
        f1 = i1;
        return f1;
    }

    public static double transformFromIntToDouble(int i1, double d1) {
        d1 = i1;
        return d1;
    }

    public static byte transformFromLongToByte(long l1, byte b1) {
        b1 = (byte) l1;
        return b1;
    }

    public static short transformFromLongToShort(long l1, short s1) {
        s1 = (short) l1;
        return s1;
    }

    public static char transformFromLongToChar(long l1, char c1) {
        c1 = (char) l1;
        return c1;
    }

    public static int transformFromLongToInt(long l1, int i1) {
        i1 = (int) l1;
        return i1;
    }

    public static float transformFromLongToFloat(long l1, float f1) {
        f1 = l1;
        return f1;
    }

    public static double transformFromLongToDouble(long l1, double d1) {
        d1 = l1;
        return d1;
    }


    public static byte transformFromFloatToByte(float f1, byte b1) {
        b1 = (byte) f1;
        return b1;
    }

    public static short transformFromFloatToShort(float f1, short s1) {
        s1 = (short) f1;
        return s1;
    }

    public static char transformFromFloatToChar(float f1, char c1) {
        c1 = (char) f1;
        return c1;
    }

    public static int transformFromFloatToInt(float f1, int i1) {
        i1 = (int) f1;
        return i1;
    }

    public static long transformFromFloatToLong(float f1, long l1) {
        l1 = (long) f1;
        return l1;
    }

    public static double transformFromFloatToDouble(float f1, double d1) {
        d1 = f1;
        return d1;
    }

    public static byte transformFromDoubleToByte(double d1, byte b1) {
        b1 = (byte) d1;
        return b1;
    }

    public static short transformFromDoubleToShort(double d1, short s1) {
        s1 = (short) d1;
        return s1;
    }

    public static char transformFromDoubleToChar(double d1, char c1) {
        c1 = (char) d1;
        return c1;
    }

    public static int transformFromDoubleToInt(double d1, int i1) {
        i1 = (int) d1;
        return i1;
    }

    public static long transformFromDoubleToLong(double d1, long l1) {
        l1 = (long) d1;
        return l1;
    }

    public static float transformFromDoubleToFloat(double d1, float f1) {
        f1 = (float) d1;
        return f1;
    }
}
