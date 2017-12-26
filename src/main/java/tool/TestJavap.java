package tool;

/**
 * @author zhaokl
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date ${date} ${time}
 */
public class TestJavap {

    int i;

    static int ii;

    Integer integer;

    String s;

    public int getI() {
        ++ii;

        return i;
    }

    public int getIi() {
        return ii;
    }



    public static void main(String[] args) {
        TestJavap testJavap = new TestJavap();

        System.out.println("hello: i = " + testJavap.getI());
        System.out.println("hello: ii = " + testJavap.getIi());
    }
}
