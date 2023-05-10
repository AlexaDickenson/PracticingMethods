class AverageMethod {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;

        int sum = sum(num1,num2,num3);
        double average = average(num1, num2, num3);
        System.out.println("The average is: " + average);
    }

    public static Integer sum (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static Double average (int num1, int num2, int num3) {
        double total = num1 + num2 + num3;
        return total/3;
    }
}
class DivideMethod {
         public static void main(String[] args) {
             double division = divide(1,3);
             System.out.println("1 / 3 = " + division);

         }

         public static double divide (double num1, double num2) {
             return num1/num2;
         }
     }

     class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(first());
        System.out.println(second());
        System.out.println(third());
    }

    public static String first () {             // a method that returns a string
        return "String of text";
    }

    public static Integer second () {           // a method that returns an integer
        return 5;
    }

    public static Boolean third () {           // a method that returns a boolean
        return false;
    }
}

