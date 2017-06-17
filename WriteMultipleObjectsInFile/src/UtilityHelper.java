import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilityHelper {
	private String file = "employee.ser";
	
	
	
	public void writeObject(Employee emp) 
	{
		try{
		FileOutputStream fos=new FileOutputStream(file,true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public void writeObjects(ArrayList<Employee> emp) 
	{
		try{
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public void readObject()
	{
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			Employee emp=(Employee)ois.readObject();		
			//emp.display();
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public ArrayList<Employee> readObjects()
	{
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			ArrayList<Employee> emp=(ArrayList<Employee>)ois.readObject();
			fis.close();
			ois.close();
			return emp;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}

	public Employee readEmployee(Scanner scanner) {
		// TODO Auto-generated method stub
		String name=scanner.next();
		int age=scanner.nextInt();
		return new Employee(name, age);
	}
	
}
