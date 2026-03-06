public class MathOperations{
    public static void main(String[]args){
        int a=10;
        int b=2;
        
        System.out.println("These are Arithmetic operators: + , - , * , % , /");
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a%b=" + (a%b));
        System.out.println("a/b=" + (a/b));
        
        System.out.println("\n");
        System.out.println("Assignment Operators:");
            int y = 10;
        System.out.println("y += 5 : " +( y += 5));
        System.out.println("y -= 3 : " + (y-= 3));
        System.out.println("y *= 2 : " + (y*= 2));
        System.out.println("y /= 4 : " + (y/= 4));
        
        System.out.println("\n");
        System.out.println("Relational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        
        System.out.println("\n");
        System.out.println("Logical Operators:");
        boolean p = true;
        boolean q = false;
        System.out.println("p && q : " + (p && q)); // AND
        System.out.println("p || q : " + (p || q)); // OR

        
        System.out.println("\n");
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Maximum value = " + max);
        
        System.out.println("\n");
        System.out.println("Unary Operators:");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("After x++ : " + x);
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("for -");
        System.out.println("x = " + x);
        System.out.println("x-- = " + (x--)); // post-increment
        System.out.println("After x-- : " + x);
        System.out.println("--x = " + (--x)); // pre-increment


        
        
        
                
        
        
}
}