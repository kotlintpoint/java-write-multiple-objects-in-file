import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner scanner=new Scanner(System.in);
		UtilityHelper helper=new UtilityHelper();
		ArrayList<Employee> employees=helper.readObjects();
		do{
			System.out.println("1. Add Employee");
			System.out.println("2. List Employee");
			System.out.println("3. Exit");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				Employee emp=helper.readEmployee(scanner);
				employees.add(emp);
				helper.writeObjects(employees);
				break;
			case 2:
				ArrayList<Employee> emps=helper.readObjects();
				System.out.println(emps);
				break;
			}
		}while(choice!=3);
		scanner.close();
	}

}
