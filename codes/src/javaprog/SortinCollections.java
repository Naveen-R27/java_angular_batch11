package javaprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if ((o instanceof Student) && (((Student) o).getId() == this.getId())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Student o) {
		/*if (this.getId() > o.getId()) {
			return 1;
		} else if (this.getId() < o.getId()) {
			return -1;
		} else {
			return 0;
		}*/

		int x = this.getId() - o.getId();
		if (x == 0) {
			x = this.getName().compareTo(o.getName());
		}
		return x;

		// return this.getName().compareTo(o.getName());

	}

	public String toString() {
		return String.format("Id=%s,Name =%s", this.id, this.name);
	}

}

public class SortinCollections {
	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student(101, "John"));
		std.add(new Student(104, "Carl"));
		std.add(new Student(102, "Ben"));
		std.add(new Student(103, "Zen"));
		std.add(new Student(105, "Gen"));

		Collections.sort(std);
		System.out.println(std);

	}

}
