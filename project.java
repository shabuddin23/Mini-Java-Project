package MIni_Project;

import java.util.*;
class Student{
	   
    String name;
    int age;
    String branch;
    String gender;
    
   
    Student(String name,int age,String branch,String gender){
       
        this.name=name;  
        this.age=age;
        this.branch=branch;
        this.gender=gender;
        }
}

public class project {

	public static void main(String[] args) {
		int id=1,ID2;
		int optione;
		Scanner sc =new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		HashMap<Integer, Student> studentMap = new HashMap<>();
		 
		int option;
		do {
			System.out.println("Menu \n 1.Add Students Details \n 2.Remove Student \n 3.Display Student Details \n 4.Edit Student Details \n 5.exit ");
		option = sc.nextInt();
		sc.nextLine();
		if (option < 1 || option > 5) {
		    System.out.println("Invalid menu option");
		    option = sc.nextInt();
			sc.nextLine();
		}
		switch(option){
		
			case 1: Boolean next =true;
				do {
					System.out.println("Enter Student Name : ");
					String name =sc.nextLine();
					if (name.isEmpty()) {
					    System.out.println("Name cannot be empty \n enter valid name");
					    name =sc.nextLine();
					}
					System.out.println("Enter Student Age : ");
					int age =sc.nextInt();
					sc.nextLine();
					if (age <= 0 || age > 120) {
					    System.out.println("Enter valid age : ");
					    age =sc.nextInt();
					    sc.nextLine();
					}

					System.out.println("Enter Student Branch : ");
					String branch =sc.nextLine();
					System.out.println("Enter Student Gender : ");
					String gender =sc.nextLine();
					
					students.add(new Student(name,age,branch,gender));
					System.out.println("do you want to enter another student details : (if yes press y and enter or if no press n and enter");
					char op=sc.next().charAt(0);
					sc.nextLine();
					if (op == 'y' || op == 'Y')
					{
						next=true;
					}
					else {
						next =false;
					}
			}
			while(next);
				
		        for (Student s : students) {
		            studentMap.put(id, s);
		            id++;
		        }
				
				break;
			case 2: System.out.println("Enter the student id you want to remove : ");
					int ID=sc.nextInt();
					sc.nextLine();
					if (!studentMap.containsKey(ID)) {
					    System.out.println("Student ID not found\n enter valid id : ");
					    ID=sc.nextInt();
						sc.nextLine();
					}
					studentMap.remove(ID);
					System.out.println("Updated student list is : \n");
					for(Map.Entry<Integer,Student>entry:studentMap.entrySet()){
			            int sid =entry.getKey();
			            Student s = entry.getValue();
			            System.out.println(sid + "\t-\t" + s.name+"\t"+s.age+"\t"+s.branch+"\t"+s.gender);
			        }
				break;
			case 3:
				for(Map.Entry<Integer,Student>entry:studentMap.entrySet()){
		            int sid =entry.getKey();
		            Student s = entry.getValue();
		            System.out.println(sid + "\t-\t" + s.name+"\t"+s.age+"\t"+s.branch+"\t"+s.gender);
		        }
				
//				Iterator<Student> iterator =students.iterator();
//			System.out.println("name"+"\t"+"age"+"\t"+"branch"+"\t"+"gender");
//			while(iterator.hasNext()){
//	            Student s = iterator.next();
//	            System.out.println(s.name+"\t"+s.age+"\t"+s.branch+"\t"+s.gender);
//	        }
				break;
			case 4:
				System.out.println("Enter the id of student you want to edit ");
				ID2=sc.nextInt();
				sc.nextLine();
				Student s =studentMap.get(ID2);
				System.out.println("What you want to edit : \n1.name\n2.age\n3.Branch\n4.gender");
				optione=sc.nextInt();
				sc.nextLine();
				switch(optione) {
				case 1:System.out.println("Editing name of id( "+ID2+" ) \nEnter  name : ");
		        
		        s.name = sc.nextLine();
		        System.out.println("edit done successfully");
				break;
				case 2:System.out.println("Editing age of id( "+ID2+" ) \nEnter  age : ");
		        
		        s.age= sc.nextInt();
		        sc.nextLine();
		        System.out.println("edit done successfully");
				break;
				case 3:System.out.println("Editing branch of id( "+ID2+" ) \nEnter  Branch : ");
		        
		        s.branch = sc.nextLine();
		        System.out.println("edit done successfully");
				break;
				case 4:System.out.println("Editing gender of id( "+ID2+" ) \nEnter gender : ");
		        
		        s.gender = sc.nextLine();
		        System.out.println("edit done successfully");
				break;
				case 5:System.out.println("changed mind thats okay!!!");
				break;
				default:System.out.println("enter correct option");
				break;
				}
			break;
			case 5 :System.out.println("Exiting the menu .........");
			break;
			default:System.out.println("enter correct option");
				break;
			
		}
		}while(option!=5);
	}

}
