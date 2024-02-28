package serializationanddeserialzationLearm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	int pid;
	String name;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p = new Person();
		p.pid = 100;
		p.name = "Tushar";

		// Serialization

		System.out.println("Serialization Started");

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush(); // saved the data
		oos.close(); // close file

		System.out.println("Serialzation Completed");

		System.out.println("De Serialization Started");
		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Person p1 = (Person) object;
		System.out.println(p.pid);
		System.out.println(p.name);

		System.out.println("De seialization Completed");
	}

}
