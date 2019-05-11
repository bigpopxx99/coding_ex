import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> set = new TreeSet<>();
		Person person1 = new Person("xiaohua", 6);
		Person person2 = new Person("xiaoli", 7);
		Person person3 = new Person("dahua", 5);
		Person person4 = new Person("aaa", 6);
		set.add(person1);
		set.add(person2);
		set.add(person3);
		set.add(person4);
		
		Iterator<Person> iterator = set.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("name:"+person.name+" age:"+person.age);
		}
	}

}

class Person implements Comparable<Person> {
	public String name;
	public int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int num = this.age - o.age;
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
	
	
}
