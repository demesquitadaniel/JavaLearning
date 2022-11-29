public class MyNewProgram {

    public static void main(String[] args) {
        var login = "ola";
        var pw = "ddehesffshjjasd";
        var number = false;

        //  variable -> type: Text (Strings)
        //  variable -> type: Numbers (Int)
        //  variable -> type: fractional numbers (Double)
        //  variable -> type: boolean (true/false, on/off, 1/0)

        //  Data type:
        //type   name    gets   data
        String  login2    =    "Hello"; // text
        int     number2   =     277;    // numbers
        double  percent   =     72.45;  // fractional numbers
        boolean isDriver  =     true;   // boolean (state true or false)

        System.out.println(login);
        System.out.println(pw);
        System.out.println(" ");
        System.out.println(login2);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(percent);
        System.out.println(isDriver);

        //  variables are memory slots designated to retain information (presented by their types)
        int numbers;    // variable daclaration
        numbers = 55;   // variable gets data
        System.out.println("The number is: " + (numbers + 10)); //data manipulation
    }

}
