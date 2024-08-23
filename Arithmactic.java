// Write a program to implement the basic arithmatic operations on two variables.
class Arithmaticoperations
{
    int a,b;
    void add()
    {
         System.out.println("\n The addition is:-"+(a+b));
    }
    void sub()
    {
        System.out.println("\n The subtraction is:-"+(a-b));
        
    }
    void mul()
    {
        System.out.println("\n The multiplication is:-"+(a*b));
    }
    void div()
    {
        System.out.println("\n The divison is:-"+(a/b));
    }
    public static void main(String arr[])
    {
        Arithmaticoperations a1=new Arithmaticoperations();
        a1.a=20;
        a1.b=2;
        a1.add();
        a1.sub();
        a1.mul();
        a1.div();
    }
    
}

