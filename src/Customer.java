import java.util.Scanner;
public class Customer
{
    Scanner s= new Scanner(System.in);
 Customer(){
     System.out.println("");
 }
 void Customerdetails(){
     int Id ;
     String Name="NAVEEN KUMAR K";
     String Mobile_No = "9677619114";
     System.out.println("ENTER CUSTOMER ID:");
     Id=s.nextInt();
     System.out.println("ENTER CUSTOMER NAME:" + Name);
     System.out.println("ENTER MOBILE NUMBER:" + Mobile_No);
 }
}
class product extends Customer{
    int Product_Id[]={1,2,3,4,5};
    String[] Product_Name={"REDMI","APPLE","ONEPLUS","MOTOROLA","VIVO"};
    int Cost[]={20000,145000,65000,23000,27500};
    int Num,pro_id,Total,Totalcost;
void Productdetails()
    {
     System.out.println("PRODUCT DETAILS");
     for(int i=0;i<=4;i++)
     {
      System.out.println("PRODUCT ID"+ Product_Id[i]);
      System.out.println("PRODUCT NAME"+ Product_Name[i]);
      System.out.println("COST "+ Cost[i]);
     }
    }
     void buyproduct()
     {
     System.out.println("ENTER THE PRODUCT ID THAT YOU WOULD LIKE TO BUY");
     Num=s.nextInt();
     pro_id=Num-1;
     System.out.println("QUANTITY");
     Total=sc.nextInt();
     System.out.println("PRODUCT ID"+Num);
     System.out.println("PRODUCT NAME"+Product_Name[pro_id] );
     Totalcost=Total*Cost[pro_id];
     System.out.println("TOTAL"+ Totalcost);
    }
}
class MainTest{
    public static void main(String args[])
    {
     Customer obj=new Customer();
     obj.Customerdetails();
     product Obj1=new product();
     Obj1.Productdetails();
     Obj1.buyproduct();
     
}}

