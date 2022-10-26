package FileReaderandComprable;

public class Person implements Comparable {
	String name;
	String surname;
	long id;

	public Person(String name, String surname, long id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
