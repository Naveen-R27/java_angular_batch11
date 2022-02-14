package javaprog;

import java.util.Arrays;

class sortStudentDetails{
	private int id;
	private String name;
	
	public sortStudentDetails(int id ,String name) {
		this.id=id;
		this.name=name;
	}
	public sortStudentDetails() {
		
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
	
	@Override
	public String toString() {
		return String.format("Id=%s,Name =%s",this.id,this.name);
	}
	
	public void sortbyidandname(int [] arr1 , String [] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("After soring accorind to ID");
		System.out.println(Arrays.toString(arr1));
		System.out.println("After sorting accoring to name");
		System.out.println(Arrays.toString(arr2));
		
	}	
}

class sortStudentDetailArray {
	public static sortStudentDetails[] sortById(sortStudentDetails[] student) {
		sortStudentDetails swapping;
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				if (student[j].getId() > student[j + 1].getId()) {
					swapping = student[j];
					student[j] = student[j + 1];
					student[j + 1] = swapping;
				}
			}
		}
		return student;
	}
	public static sortStudentDetails[] sortByName(sortStudentDetails[] student) {
		sortStudentDetails swapping;
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				if (student[j].getName().compareTo(student[j + 1].getName()) > 0) {
					swapping = student[j];
					student[j] = student[j + 1];
					student[j + 1] = swapping;
				}
			}
		}
		return student;
	}
	}







public class Sortstudent {
	public static void main(String[] args) {
		sortStudentDetails [] std = {new sortStudentDetails(103,"minion"), new sortStudentDetails(100,"drag"), new sortStudentDetails(101,"pekka")};
		int [] arr= {std[0].getId(),std[1].getId(),std[2].getId()};
		String [] arr2 = {std[0].getName(),std[1].getName(),std[2].getName()};
		
		//student s = new student();
		//s.sortbyidandname(arr, arr2);
		//Arrays.sort(arr2);
		//System.out.println(Arrays.toString(arr2));
		
		sortStudentDetailArray so = new sortStudentDetailArray();
		so.sortById(std);
		System.out.println(Arrays.toString(std));
		so.sortByName(std);
		System.out.println(Arrays.toString(std));
		
	}
	
	
	
	
	

}
