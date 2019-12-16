public class ObjectTraining {

	// TODO 1. Add the following private attributes :
	// - name (String)
	private String name;
	// - age (int)
	private int age;
	// - wilder (boolean)
	private boolean wilder;

	// TODO 2. Add a Constructor with name and age arguments (in this order)
	// This constructor must initialize name and age attributes

	// TODO 3. Add getter method for name attribute

	// TODO 4. Add setter method for name attribute

	// TODO 5. Add getter method for age attribute

	// TODO 6. Add setter method for age attribute

	// TODO 7. Add getter method for wilder attribute

	// TODO 8. Add setter method for wilder attribute

	// TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm
	// {age}"
	// where you replace {name} and {age} with attributes values

	// Do not remove this empty constructor !
	public ObjectTraining() {
	}

	public ObjectTraining(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String whoAmI() {
		return "My name is " + this.name + " and I'm " + this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isWilder() {
		return this.wilder;
	}

	public void setWilder(boolean wilder) {
		this.wilder = wilder;
	}
}
