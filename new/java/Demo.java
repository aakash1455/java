package Tester;

public class Demo implements java.io.Serializable {

	public int id;
	public String desc;
	@Override
	public String toString() {
		return "Demo [id=" + id + ", desc=" + desc + "]";
	}
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	
}
