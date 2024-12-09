class Class9 {

    //functions in java
    static int multiplication(int num1, int num2){
        int mul = 0;
        for(int i=1;i<=num1;i++) {
            mul+=num2;
        }
        return mul;
    }

    public static void main(String argsp[]){
        int fact = 1;
        int number = 5;
        for(int i=1;i<=number;i++){
            fact = multiplication(fact, i);
        }
        System.out.print(fact);
        System.out.print(multiplication(2, 2));
    }

}
// Generate Factorial Using this logic


