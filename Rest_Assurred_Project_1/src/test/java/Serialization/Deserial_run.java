package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial_run {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("./nfs.txt");
		ObjectInputStream objin=new ObjectInputStream(fis);
	   NFSgame userobject = (NFSgame) objin.readObject();
	   
	   System.out.println(userobject.name);
	   System.out.println(userobject.level);
	   System.out.println(userobject.score);
	   System.out.println(userobject.life);

	}

}
