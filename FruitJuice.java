/*
5) Define a class named FruitJuice with the following description
 Instance variables/data members: 
 int product_code: Stores the product code number
 String flavor: stores the flavor of the juice(eg. orange, apple etc)
 String pack_type: stores the type of packaging(eg. tetra pack ,PET bottle)
 int pack_size: Stores package size(eg 200ml, 400 ml)
 int product_price: stores the price of the product
Member methods:
FruitJuice(): default constructor to initialize integer data members to 0 and String 
data members to””
Void input(): to input and store the product_code,flavor,pack_type,pack_size and 
product_price
Void discount(): To reduce the price by 10;
Void display(): To display code, flavor,pack_type, pack size and price.
*/
import java.util.Scanner;

public class FruitJuice
{
   private int product_code_no;
   private String flavor;
   private String pack_type;
   private int pack_size;
   private int product_price;

   public FruitJuice()
   {
        product_code_no = 0;
         flavor = " " ;
         pack_type = " " ;
         pack_size = 0;
         product_price = 0;

   }
   public void input()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the product_code:");
     product_code_no = sc.nextInt();
    System.out.println("Enter the falvour:");
     flavor = sc.next();
    System.out.println("Enter the Pack_Type:");
    pack_type = sc.next();
    System.out.println("Eneter the pack_size:");
     pack_size = sc.nextInt();
    System.out.println("Enter the Product_price:"); 
     product_price=sc.nextInt();
   }
   public void discount()
   { 
       product_price = product_price - 10;

   }

   public void display()
   {
    System.out.println("Enter the product_code:"+product_code_no);
    System.out.println("Enter the falvour:"+flavor);
    System.out.println("Enter the Pack_Type:"+pack_type);
    System.out.println("Eneter the pack_size:"+pack_size);
    System.out.println("Enter the Product_price:"+product_price); 

   }
     public static void main(String args[]) {
        FruitJuice fj = new FruitJuice();
        fj.input();
        fj.discount();
        fj.display();
    }

 }

 