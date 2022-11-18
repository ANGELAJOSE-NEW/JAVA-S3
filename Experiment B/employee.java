import java.util.*;
class employee{
  String name ="";
  int age;
  int phone;
  float salary;
  String address= "";
  public void printsalary(float salary) {
  System.out.println("Salary is "+salary);
  }
 }
  class officer extends employee {
    String specialization;
   }

  class manager extends employee {
    String department;
  }


 class main {
 public static void main(String[] args) {
 officer worker= new officer();
 manager person=new manager();
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter officer name: ");
 worker.name=sc.nextLine();
 System.out.println("Enter officer age: ");
 worker.age=nextInt();
 System.out.println("Enter officer phone number: ");
 worker.phone= nextInt();
 System.out.println("Enter officer address: ");
 worker.address=sc.nextLine();
 System.out.println("Enter officer salary: ");
 worker.salary=nextFloat();

 System.out.println("Enter manager name: ");
 manager.name=sc.nextLine();
 System.out.println("Enter manager age: ");
 manager.age=nextInt();
 System.out.println("Enter manager phone number: ");
 manager.phone=nextInt();
 System.out.println("Enter manager address: ");
 manager.address=sc.nextLine();
 System.out.println("Enter manager salary: ");
 manager.salary=nextFloat();
 

 System.out.println("Officer details");
 System.out.println("name: "+worker.name);
 System.out.println("age: "+worker.age);
 System.out.println("phone number: "+worker.phone);
 System.out.println("address: "+worker.address); 
 worker.printsalary();

 System.out.println("Manager details");
 System.out.println("name: "+manager.name);
 System.out.println("age: "+manager.age);
 System.out.println("phone number: "+manager.phone);
 System.out.println("address: "+manager.address);
 manager.printsalary();
}
}
