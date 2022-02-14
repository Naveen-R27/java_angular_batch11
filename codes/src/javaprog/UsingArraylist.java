package javaprog;

import java.util.ArrayList;
import java.util.Collections;

class Studentmarks{
	private int id;
	private String name;
	private int cmarks;
	private int pmarks;
	private int mmarks;
	
	public Studentmarks(int id,String name,int cmarks,int pmarks,int mmarks) {
		this.id = id;
		this.name = name;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
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
	public int getCmarks() {
		return cmarks;
	}
	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}
	public int getPmarks() {
		return pmarks;
	}
	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}
	public int getMmarks() {
		return mmarks;
	}
	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	
	public int Avg_marks() {
		return (this.cmarks + this.pmarks + this.mmarks) * 100 / 300;	
}
}

class processingtheMarks{
	
	public void Totalmarks(ArrayList<Studentmarks> std) {
		
		ArrayList<Integer> avgm = new ArrayList<Integer>();
		
	
		for(int i =0;i<std.size();i++) {
			avgm.add(std.get(i).Avg_marks());
		}
		
		Collections.sort(avgm);
		
		int a  = avgm.get(avgm.size()-1);
		System.out.println("The Student with Maximum Average Marks is--> "+std.get(avgm.indexOf(a)).getName()+"  With the Total Average of ---> "+a);
			
	}

}

class UsingArraylist {
	public static void main(String[] args) {
		ArrayList<Studentmarks> std = new ArrayList<Studentmarks>();
		std.add(new Studentmarks(100,"John",85,95,66));
		std.add(new Studentmarks(101,"Rock",80,75,86));
		std.add(new Studentmarks(100,"John",75,65,76));
		std.add(new Studentmarks(100,"John",85,95,70));
		
		processingtheMarks p = new processingtheMarks();
		System.out.println("<----------------- ^ ^ ---------------- > \n");
		p.Totalmarks(std);
		
		
	}

}


