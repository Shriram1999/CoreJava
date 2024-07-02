package IOs;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Marksheetseriali implements Serializable {
	private String name;
	private int math;
	private int physics;
	private int chemistry;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
/*public static void main(String[] args) throws IOException{
		
		FileOutputStream file = new FileOutputStream("C:/Sky/Aakash.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheetseriali ms = new Marksheetseriali();
		ms.name= "Aakash";
		ms.math= 90;
		ms.chemistry=76;
		ms.physics= 55;
		out.writeObject(ms);
		out.close();
		file.close();
		
	}*/
	
	
}
