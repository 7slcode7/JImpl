public class Chap1_1 implements Testable{

    public static void varArgsFunction(int param1, int ... varArgsParam){
        for (int twmpParam : varArgsParam){
            System.out.println(twmpParam);
        }
    }
    static public  void main(String[] lahiru) {
        System.out.println("Lahiru Chandima");
        Testable.staticMethod();
//      varArgs function test
        varArgsFunction(1,2,3,4,5);
        varArgsFunction(1,2);
    }
}
