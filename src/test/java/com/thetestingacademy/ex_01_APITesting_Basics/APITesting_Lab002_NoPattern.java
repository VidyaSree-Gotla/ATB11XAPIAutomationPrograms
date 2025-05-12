package ex_01_APITesting_Basics;

public class APITesting_Lab002_NoPattern {

        public void step1(){
            System.out.println("Step 1");
        }
        public void step2(){
            System.out.println("Step 2");
        }
        public  void step3(){
            System.out.println("Step 3");
        }

        //with out gherkin syntax, we used to access every method of the class using the object separately.
        public static void main(String[] args) {
            APITesting_Lab002_NoPattern NP = new APITesting_Lab002_NoPattern();
            NP.step1();
            NP.step2();
            NP.step3();
        }
    }


