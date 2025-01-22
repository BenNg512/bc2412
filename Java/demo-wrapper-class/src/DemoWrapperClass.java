public class DemoWrapperClass {
    public static void main(String[] args) {
        int x = 3; // x is a Primitive type variable
        Integer x2 = x; // ! change Primitive type to Wrapper type (an Object)
        System.out.println(x2); // 3
        System.out.println(x2.doubleValue()); // 3.0
        System.out.println(x2.longValue()); // 3

        String s = "hello";
        System.out.println(s.length()); // 5

        double d = 3.9;
        Double d2 = d; // auto-box
        System.out.println(d2); // 3.9
        System.out.println(d2.intValue());//3

        float f = d2.floatValue();
        System.out.println(f); // 3.9
    
        double d3 = d2.doubleValue(); // ! un-box, change Wrapper type to Primitive
        double d4 = d2;

        System.out.println(d3); // 3.9

        // char -> Character
        char c1 = 'a';
        Character c2 = c1;
        System.out.println(c2.equals('a'));
        System.out.println(c2.compareTo('a')); // 0-> equal, -1->smaller, 1->bigger
        String s2 = c2.toString();
        Character c3 = 'c';
        Character c4 = 'A';
        System.out.println(c3.compareTo('a')); //0
        System.out.println(c4.compareTo('a')); //-32

        int asciiOfA = 'A';
        int asciiOfa = 'a';
        System.out.println(asciiOfa - asciiOfA); //32
        // boolean -> Boolean
        boolean b = true;
        Boolean b2 = b;
        String s3 = b2.toString();
        System.out.println(s3);
        // byte -> Byte
        byte byt = 3;
        Byte byt2 = byt;
        System.out.println(byt2);
        // short -> Short
        short st = 3;
        Short st2 = st;
        System.out.println(st2);
        // long -> Long
        long l = 3;
        Long l2 = l;
        System.out.println(l2);
        // float -> Float
        float f2 = 3.9f;
        Float f3 = f2;
        System.out.println(f3);


    }
}
