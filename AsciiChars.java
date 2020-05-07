
public class AsciiChars{

    //Printing valid numeric input (0-9)
    public static void printNumbers(){
        int i;

        for(i = 48; i <= 57; i++){
            System.out.println(" The Ascii value of : " + (char)i + " = " + i);
        }
    }
    //Printing valid lowercase alphabetic input (a-z)
    //ascii numbers for lower case is 97-122
    public static void printLowerCase(){
        int a;
        for(a = 97; a <=122; a++){
            System.out.println(" The Lower case value of: " + (char)a + " = " + a); 
        }
    }
    //printing valid uppercase alphabetic inputs (A-Z)
    //ascii numbers for uppercase is 65-90
    public static void printUpperCase(){
        int b;
        for(b = 65; b <=90; b++){
            System.out.println(" The Upper case value of: " + (char)b + " = " + b);
        }

    }

}
