import java.util.*;
class garcoll{
public static void main(String arg[]){
Runtime r=Runtime.getRuntime();
long mem1,mem2,mem3;
Integer someints[]=new Integer[1000];

System.out.println("Total memory is :  "+r.totalMemory());
mem1=r.freeMemory();
System.out.println("Initial free memory : "+mem1);
r.gc();
mem1=r.freeMemory();
System.out.println("Free memory after garbage collection : "+mem1);
for(int i=0;i<1000;i++)
someints[i]=new Integer(i);
mem2=r.freeMemory();
System.out.println("Free memory after initializing the array :"+mem2);
mem3=mem1-mem2;
System.out.println("Memory used by allocation :"+mem3);
for(int i=0;i<1000;i++)
someints[i]=null;
r.gc();
mem2=r.freeMemory();
System.out.println("Free memory after making null : "+mem2);



}





}
