
public class Elephant {
	
	private String name;
	private int tusks;
	private String size;
	private int age;
	private int legs;
	
	public Elephant() {
		name = "Isaac";
		tusks = 2;
		size = "Big";
		age = 26;
		legs = 4;
	}
	
	public Elephant(String name, int tusks, String size, int age, int legs) {
		this.name = name;
		this.tusks = tusks;
		this.size = size;
		this.age = age;
		this.legs = legs;		
	}
	
	public int getTusks() {
		return tusks;
	}
	
	public void setTusks(int tusks) {
		this.tusks = tusks;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public String getName() {
		return name;
	
		
	}
	
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		
		System.out.println("Elephant: " + elephant.getName());
		System.out.println("Tusks: " + elephant.getTusks());
		System.out.println("Size: " + elephant.getName());
		System.out.println("Age: " + elephant.getAge());
		System.out.println("Legs: " + elephant.getLegs());
	}

}
