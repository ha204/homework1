

public class Human {
	//Attributes
	public String name;
	public String job;
	public int age;
	public String all;
	//Constructor#
	public Human(String name, String job, int age){
		this.name = name;
		this.job = job;
		this.age = age;
	}
	//Methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAll() {
		all = this.name+" - "+this.job+" - "+this.age;
		return all;
	}
	

}
