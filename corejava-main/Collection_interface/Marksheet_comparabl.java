package collection_interface;

public class Marksheet_comparabl implements Comparable<Marksheet_comparabl> {

	private   String rollNo;
	private int physics;
	private int chamistry;
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChamistry() {
		return chamistry;
	}
	public void setChamistry(int chamistry) {
		this.chamistry = chamistry;
	}
	@Override
	public int compareTo(Marksheet_comparabl o) {
		
		return this.rollNo.compareTo(o.getRollNo());
	}

}
