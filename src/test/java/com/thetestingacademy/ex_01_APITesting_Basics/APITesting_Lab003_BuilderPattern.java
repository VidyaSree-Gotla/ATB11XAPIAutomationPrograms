package ex_01_APITesting_Basics;

public class APITesting_Lab003_BuilderPattern {
    public APITesting_Lab003_BuilderPattern Step1() {
        System.out.println("Step 1");
        return this; //this refers to the same object reference every time
    }

    public APITesting_Lab003_BuilderPattern Step2() {
        System.out.println("Step 2");
        return this;
    }

    public APITesting_Lab003_BuilderPattern Step3() {
        System.out.println("Step 2");
        return this;
    }

    //below we used gherkin Builder pattern where we can access all the methods in a single line using .(dot) operator
    public static void main(String[] args) {
        APITesting_Lab003_BuilderPattern BP = new APITesting_Lab003_BuilderPattern();
        BP.Step1().Step2().Step3();

    }
}
