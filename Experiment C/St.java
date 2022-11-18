import java.util.*;
class St{
public static void main(String arg[]){
System.out.println("Enter the integers with space");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringTokenizer st=new StringTokenizer(s," ");
int sum=0;
while(st.hasMoreTokens()){
String temp=st.nextToken();
Integer n=Integer.parseInt(temp);
System.out.println(temp);
sum=sum+n;

}
System.out.println("sum is "+sum);

}
}
