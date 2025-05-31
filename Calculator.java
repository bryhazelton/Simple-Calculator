import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String termination = "Invalid input entered. Terminating...";
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operation:");
        String choice = input.next();
        String choicelower = choice.toLowerCase();
        switch (choicelower){
            case "add":         int a, b;
                                System.out.println("Enter two integers:");
                                if (input.hasNextInt())
                                    a = input.nextInt();
                                else{
                                    System.out.println(termination);
                                    break;
                                }                                
                                if (input.hasNextInt()){
                                    b = input.nextInt();
                                    System.out.println("Answer: " + (a+b));
                                    break;
                                }
                                else{
                                    System.out.println(termination);
                                    break;
                                }
                    
            case "subtract":    int c, d;
                                System.out.println("Enter two integers:");
                                if (input.hasNextInt())
                                    c = input.nextInt();
                                else{
                                    System.out.println(termination);
                                    break;
                                }
                                if (input.hasNextInt()){
                                    d = input.nextInt();
                                    System.out.println("Answer: " + (c-d));
                                    break;
                                }
                                else{
                                    System.out.println(termination);
                                    break;
                                }
                                                                   
            case "multiply":    double e, f;
                                System.out.println("Enter two doubles:");
                                if (input.hasNextDouble())
                                    e = input.nextDouble();
                                else{
                                    System.out.println(termination);
                                    break;
                                }
                                if (input.hasNextDouble()){
                                    f = input.nextDouble();
                                    System.out.printf("Answer: %.2f\n", (e*f));
                                    break;
                                }
                                else{
                                    System.out.println(termination);
                                    break;
                                }

            case "divide":      double x, y;
                                System.out.println("Enter two doubles:");
                                if (input.hasNextDouble())
                                    x = input.nextDouble();
                                else{
                                    System.out.println(termination);
                                    break;
                                }
                                if (input.hasNextDouble())
                                    y = input.nextDouble();
                                else{
                                    System.out.println(termination);
                                    break;
                                }
                                if (y == 0.0){
                                    System.out.println(termination);
                                    break;
                                    }
                                else{
                                    System.out.printf("Answer: %.2f\n", (x/y));
                                    break;
                                }

            case "alphabetize": System.out.println("Enter two words:");
                                String o= input.next();
                                String p = input.next();
                                String m = o.toLowerCase();
                                String n = p.toLowerCase();
                                if (m.compareTo(n) == 0){
                                    System.out.println("Chicken or Egg.");
                                    break;
                                }
                                if (o.compareTo(p) < 0)
                                    System.out.println("Answer: " + o + " comes before " + p + " alphabetically.");
                                else{
                                    System.out.println("Answer: "+ p + " comes before " + o + " alphabetically.");
                                    break;
                                }

            default:
                                System.out.println(termination);
                            
        }       
    }    
}
