import java.util.Scanner;


    import java.util.*;
    public class calculator {

        public static void main(String[] args) {
            String input1 = "";
            System.out.println("Welcome to the calculator program");
            System.out.println("In this program you will have the option to choose from a variety of calculators");
            Scanner in = new Scanner(System.in);
            System.out.println("To choose the base calculator type base");
            System.out.println("To get a list of formulas type list");
            System.out.println("To use the quadratics calculator type quad");
            System.out.println("To use the slope and point slope calculater type slope");
            input1 = in.nextLine();

            //calculators
            if (input1.equals("base")) { //checks user input
                System.out.println(calc()); //runs base calculator
            }
            if (input1.equals("list")) { //checks user input
                formula(); //displays a list of formulas
            }
            if (input1.equals("quad")) {
                quadratics();
            }
            if (input1.equals("slope")) {
                slopecalc();
            }

        }


        public static int calc () { //Calculator base
            int total = 0;
            System.out.println("Hello, welcome to the base calculater");
            System.out.println("This calculater can perform adding, subtracting, multiplication and division");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first number to calculate");
            int num1 = scan.nextInt(); //first value
            System.out.println("Enter the second number you want to calculate");
            int num2 = scan.nextInt(); //second value
            System.out.println("To add the two numbers enter 1"); // 1 to add
            System.out.println("To subtract the two numbers enter 2"); //2 to subtract
            System.out.println("To multiply the two numbers enter 3"); //3 to multiply
            System.out.println("To divide the two numbers enter 4"); // 4 to divide
            int ans = scan.nextInt(); //number determines operator

            //Calculations
            if (ans == 1) total = num1 + num2; // add
            if (ans == 2) total = num1 - num2; // subtract
            if (ans == 3) total = num1 * num2; // multiply
            if (ans == 4) total = num1 / num2; // divide

            return total;

        }

        public static void formula () { //gives a list of a variety of math formulas
            //formula list
            String pyth = "Pythagorean theorm = a^2+b^2=c^2";
            String pointslope = "Point Slope Formula = y-y1=m(x-x1)";
            String slope1 = "Slope Formula = y2-y1/x2-x1";
            String quad = ("Quadratic Formula = x = -b +or- squareroot(b^2-4ac/2a)");//prints formulas
            System.out.println(pyth); //pythagorean theorm formula
            System.out.println(pointslope); //point slope formula
            System.out.println(slope1); //slope formula
            System.out.println(quad); //quadratic formula

        }

        public static void quadratics () { //solves quadratics using the quadratic formula
            int counter1 = -1;
            Scanner quad = new Scanner(System.in);
            System.out.println("Input the A value for the formula");
            int a = quad.nextInt(); // a value
            System.out.println("Input the B value");
            int b = quad.nextInt(); //b value
            System.out.println("Input the C value");
            int c = quad.nextInt(); //c value
            int a2 = a*2; //a*2 part of formula
            int b2 = b*b; //b^2 part of formula

            double val1 = Math.sqrt(b2-4*a*c); //takes the square root of the values under it
            double Posans = -1*b+val1; //solves for +
            double Negans = -1*b-val1; //solves for -
            double total1 = Posans/a2; //final answer 1
            double total2 = Negans/a2; //final answer 2

            //work for quadratic formula is shown below
            System.out.println("a = " + a + " b = " + b + " c = " + c);
            System.out.println ("The setup for the problem is");
            System.out.println("-" + b +  " +- squareroot(" + b + "^2-4" + a + c + "/" + "2" + a); //displays equation
            System.out.println("-" + b +  " +- squareroot(" + b2 + "-4" + a + c + "/" + "2" + a2); //refines equation
            System.out.println(counter1 + "*" + b + " +- " + val1 + "/" + a2); //applies + and - to the equation
            System.out.println("Solve the top of the equation above using both plus and minus");
            System.out.println(Posans + "/" + a2 + "||" + Negans + "/" + a2); //calculates both answers

            System.out.println("The solution to the equation is " + total1 + " " + total2); //Displays final outcome
        }

        public static void slopecalc () { //calculates slope and point slope
            //slope formula || y2 - y1 / x2 - x1
            //point slope formula || y - y1 = m(x-x1)
            Scanner slope = new Scanner(System.in);
            System.out.println("Enter the y1 value");
            double y1 = slope.nextInt(); //first y value
            System.out.println("Enter the y2 value");
            double y2 = slope.nextInt(); //second y value
            System.out.println("Enter the x1 value");
            double x1 = slope.nextInt(); //first x value
            System.out.println("Enter the x2 value");
            double x2 = slope.nextInt(); //second x value

            double yans = y2 - y1; //Numerator of slope formula
            double xans = x2 - x1; //Denominator of slope formula
            double totala = yans/xans; //Slope answer
            double signchange = y1 *-1; //sign change in y1
            double m = totala; //the slope number used in the point slope formula
            double mult = m*x1; //calculates the slope number * x1 value
            double final1 = mult + (-1 * y1); //shows the final answer for the second part of point slope equation

            //Slope formula work
            System.out.println(y2 + "-" + y1 + " / " + x2 + "-" + x1);
            System.out.println(yans + " / " + xans);
            System.out.println("Slope is " + totala);

            //Point slope formula work
            System.out.println("y-" + y1 + " = " + m + "(x-" + x1 + ")");
            System.out.println("y-" + y1 + " = " + m + "x" + "-" + mult);
            System.out.println("y" + " = " + m + "x" + " + " + final1);
            System.out.println("The final solution for pointslope is " + "y" + " = " + m +"x" + " + " + final1);
        }

        public static void pythag () { //calculates pythagorean theorm and can find a, b or c
            //Pythagorean theorm, a^2+b^2=c^2
            Scanner pye = new Scanner(System.in);
            System.out.println("Enter the value for the following questions, if one of the values for the equation is missing");
            System.out.println("If you are missing the value for one of the variables enter that variable here, either a, b or c");
            System.out.println("If you have all three values enter d");
            String chos = pye.toString(); //variable determines which if statement to execute
            if (chos.equals("a")) { //Solves for the missing a value
                System.out.println("Enter the value for b");
                double b1 = pye.nextInt();
                System.out.println("Enter the value for c");
                double c1 = pye.nextInt();
                System.out.println("Starting formula is");
                System.out.println("a^2" + " * " + b1 + "^2" + " = " + c1);
            }
            if (chos.equals("b")) { //Solves for the missing b value
                System.out.println("Enter the value for a");
                double a1 = pye.nextInt();
                System.out.println("Enter the value for c");
                double c2 = pye.nextInt();
            }
            if (chos.equals("c")) { //Solves for the missing c value
                System.out.println("Enter the value for a");
                double a2 = pye.nextInt();
                System.out.println("Enter the value for b");
                double b2 = pye.nextInt();

            }
            if (chos.equals("d")) { //Solves the quadratic formula using all three values
                System.out.println("Enter the value for a"); // a value
                double a3 = pye.nextInt();
                System.out.println("Enter the value for b"); //b value
                double b3 = pye.nextInt();
                System.out.println("Enter the value for c"); //c value
                double c3 = pye.nextInt();
                double ab = Math.pow(a3, 2) * Math.pow(b3, 2); //squares both a and b and then combines them
                double total4 = Math.pow(c3, 2) / ab;
                System.out.println("The starting formula is");
                System.out.println(a3 + "^2" + " * " + b3 + "^2" + " = " + c3 + "^2"); //start formula
                System.out.println(ab + " = " + c3 + "^2"); //combines a and b
                System.out.println(c3 + "^2" + " / " + ab); //divides c by the product of a and b
                System.out.println("The answer is" + total4); //displays the answer
            }
        }

        public static void trig () {

        }




    }

