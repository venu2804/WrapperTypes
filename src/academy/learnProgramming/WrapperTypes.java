package academy.learnProgramming;

public class WrapperTypes {
    public static void main(String[] args) {

        int myInt = 10;
        Integer myInteger = new Integer(20);//Boxing
        Integer myinteger1 = 30;//Auto Boxing
        Integer myInteger2 = Integer.valueOf(30);//Boxing
        Integer myInteger3 = Integer.parseInt("40");

        System.out.println("My Integer = " + myInt );
        System.out.println("My Integer = " + myInteger);
        System.out.println("My Integer1 = " + myinteger1);
        System.out.println("My Integer2 = " + myInteger2);
        System.out.println("my Integer3 =" + myInteger3);

    }
}

