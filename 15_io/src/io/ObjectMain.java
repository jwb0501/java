package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		PersonDTO dto = new PersonDTO("ȫ�浿", 25, 185.3);
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
//		oos.writeObject(dto);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO dto = (PersonDTO) ois.readObject();
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getHeight());
		ois.close();
	}

}
