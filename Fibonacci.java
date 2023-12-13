import java.util.Scanner;
public class Fibonacci
{
    public static void main(String [] args)
    {
        
         Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        
            
            int num1 = 0 ;
            int num2 = 1;
            int num3=0;
            int a = 2;
            System.out.print("Enter the  no.of Fibonacci Series :");
            int b = sc.nextInt();
            
            FibonacciSeries fs = new FibonacciSeries(num1 , num2 ,num3,a,b);
            System.out.print("Fibonacci Series :" +num1 + " "+ num2 + " ");
            fs.series();
            
            
        
       
    }

}

class FibonacciSeries
{
    private int num1 ;
    private int num2;
    private int num3;
    public int i;
     public int j;

    
    

    public FibonacciSeries(int n1 ,int n2 , int n3 ,int a,int b)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
        i = a;
        j = b;
        
    
    }
        public void series()
        {
                for(i=2 ; i<j;i++)
                {
                    num3 = num1 + num2;
                    
                    System.out.print(num3+" ");
                    num1 = num2 ;
                    num2 = num3 ;
                   
                }
        }




    
}