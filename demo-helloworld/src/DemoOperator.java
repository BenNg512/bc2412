public class DemoOperator {
  public static void main(String [] args){
    int x = 3;
    x = x + 1; // x+1
    x++; //! self +1
    ++x; //! self +1
    x += 1; // += meaning x=x+1
    System.out.println("x = " + x); //7

    int z1 = (x=x+1)+(x=x+1)+(x=x+1);
    int z = (x+=1) + (x+=1) + (x+=1);
    System.out.println(z1);

    //-1
    int y = 10;
    y = y - 1;
    y--; //! y-1 : self-1
    --y; //! y-1 : self -1
    y -= 1;
    System.out.println("y = " + y); //6

    // +2
    int b = 20;
    b = b + 2;
    b += 2;
    System.out.println("b = " + b); //24

    // -2
    int c = 100;
    c = c - 2;
    c -= 2;
    System.out.println("c = " + c); //96

    //*=
    int d = 5;
    d = d * 2;
    d *= 2;
    System.out.println("d = " + d); //20

    // /=
    int e = 20;;
    e = e / 2;
    e /= 2;
    System.out.println("e = " + e); //5

    // remainder 
    //! symble: %
    int remainder = 10 % 3; // find remainder of 10/3  
    System.out.println("remainder of 10/3 = " + remainder); //1

    // ++x vs x++
    int p = 8;
    int resultp = ++p + 3; // (p+1)+3
    System.out.println("result p(++p +3) = " + resultp); //12: 8+1+3
    // step 1: //! p becomes 9: p + 1 = 9
    // step 2: calculation: result: 9+3=12
    // step 3: assign 12 to result
    int q = 8;
    int resultq = q++ + 3; // result = q+3, then q becomes q+1
    System.out.println("result q(q++ +3) = " + resultq); //11: 8+3
    System.out.println(q++); //9
    // Step 1: calculation first: result: 8+3=11;
    // Step 2: //! q becomes 9 after calculation
    // Step 3: assign 11 to result

    // String +=
    String s = "Hello";
    s += " !";
    System.out.println(s);
    // String + anything = String
    s += " World";
    System.out.println(s);
    s += 1; //number
    System.out.println(s); //! still string
    s += true; // boolean
    System.out.println(s); //! still string

    int x10 =5;
    int y10 = 10;
    int z10 = x10 += 3 * y10;
    System.out.println(z10); //35

    int x11 =3;
    int y11 = (x11++ + 3) * x11++ * x11++; //(3+3)*4*5
    // x11++ = 3 first,
    // x11++ = 4 after (x11++ + 3), (x11++ + 3) * x11++ = 24
    // x11++ = 5 for the last one
    System.out.println("y11 = " + y11); 
    System.out.println("x11 = " + x11); // x = 5 after calculating y11, so +1

  }
}
