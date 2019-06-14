public class myMethod {static void myMethod() {

}
    for(int i = 2;i<testNumber;i++){
        int remainder = (testNumber % i);
        if (remainder == 0) {
            System.out.println(testNumber + "  Is not a prime number.\n");
            break;
        } else if (i == (testNumber - 1) && i != 2) {
            System.out.println(testNumber + " Is a Prime number\n");
            break;
        }
    }
}


