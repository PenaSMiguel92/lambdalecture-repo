// import java.util.ArrayList;

class Test {
    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }

    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }
    public static void main(String[] args) {
        // ArrayList<Integer> arrL = new ArrayList<>();
        // arrL.add(1);
        // arrL.add(2);
        // arrL.add(3);
        // arrL.add(4);

        // arrL.forEach(n -> System.out.println(n));

        // arrL.forEach(n -> {if (n % 2 == 0) System.out.println(n); });

        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;

        Test tobj = new Test();

        System.out.println("Addition is " + tobj.operate(6, 3, add));
        System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));

        FuncInter2 fobj = message -> System.out.println("Hello " + message);

        fobj.sayMessage("Revature");

    }
} 
