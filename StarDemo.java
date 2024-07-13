package homework;

import java.util.Objects;

public class StarDemo {

	public static void main(String[] args) {
		Star s = new Star();
		s.age = 18;
		Star s2 = new Star();
		s2.age = 18;
		boolean flag = s.equals(s2);
		System.out.println(flag);
	}
}

class Star{
	String name;
	int age;
	
	public Star() {
		super();
	}

	public Star(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Star other = (Star) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	
	public String toString(){
		return "Star [" + name + ", " + age + "]";
	}
}
