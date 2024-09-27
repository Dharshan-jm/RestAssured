package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class  NFSgame implements Serializable{
	
	String name;
	int level;
	long score;
	int life;
	
	public NFSgame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	
	

}

public class Serial_run{
	
	public static void main(String[] args) throws IOException {
		NFSgame user1=new NFSgame("dharshan", 10, 666000, 6);
		
		FileOutputStream fileoutput=new FileOutputStream("./nfs.txt");
		ObjectOutputStream objectout=new ObjectOutputStream(fileoutput);
		objectout.writeObject(user1);
		System.out.println("end");
		
		
	}
	
}