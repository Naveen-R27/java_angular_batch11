package javaprog;


interface Hirable{
	public void hiringcondition(Details[] dts);
}

class facebook implements Hirable{

	@Override
	public void hiringcondition(Details[] stud) {
		Details [] eligible = new Details[stud.length];
		int k = 0;
		int n = stud.length;
		for(int i =0;i<n;i++) {
			if(stud[i].Avg_marks()>70 && stud[i].getMmarks()>60 && stud[i].total_score()=="B") {
				eligible[k++]=stud[i];
			}
		}
		for(int j=0;j<eligible.length;j++) {
			if(eligible[j] != null) {
			System.out.println(eligible[j]);
			}
		}
		
		
	}
	
}

class Oneplus implements Hirable{

	@Override
	public void hiringcondition(Details[] stud) {
		Details [] eligible = new Details[stud.length];
		int k = 0;
		int n = stud.length;
		for(int i =0;i<n;i++) {
			if(stud[i].Avg_marks()>60 && stud[i].getMmarks()>75 && stud[i].total_score()=="B") {
				eligible[k++]=stud[i];
			}
		}
		for(int j=0;j<eligible.length;j++) {
			if(eligible[j] != null) {
			System.out.println(eligible[j]);
			}
		}
		
		
	}
	
}

class Microsoft implements Hirable{

	@Override
	public void hiringcondition(Details[] stud) {
		Details [] eligible = new Details[stud.length];
		//int k = 0;
		int n = stud.length;
		for(int i =0;i<n;i++) {
			if(stud[i].Avg_marks()>65 && stud[i].getMmarks()>70 && stud[i].total_score()=="B") {
				eligible[i]=stud[i];
			}
		}
		for(int j=0;j<eligible.length;j++) {
			if(eligible[j] != null) {
			System.out.println(eligible[j]);
			}
		}
		
		
	}
	
}

class Apple implements Hirable{

	@Override
	public void hiringcondition(Details[] stud) {
		Details [] eligible = new Details[stud.length];
		int k = 0;
		int n = stud.length;
		for(int i =0;i<n;i++) {
			if(stud[i].Avg_marks()>75 && stud[i].getMmarks()>85 && stud[i].total_score()=="A") {
				eligible[k++]=stud[i];
			}
		}
		for(int j=0;j<eligible.length;j++) {
			if(eligible[j] != null) {
			System.out.println(eligible[j]);
			}
		}

		
	}
	
}


class Details {
	private int id;
	private String name;
	private int cmarks;
	private int pmarks;
	private int mmarks;

	public Details(int id, String name, int cmarks, int pmarks, int mmarks) {
		this.id = id;
		this.name = name;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}
	
	public Details() {
		
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
	
	public String total_score() {
		int tot  = this.cmarks + this.pmarks + this.mmarks;
		
		if(tot > 235) {
			return "A";
	}
		else if(tot >180 && tot <=230 ) {
			return "B";
			
		}
		else if(tot>150 && tot <=180) {
			return "C";
		}
		else {
			return "D";
		}
		
	}
	
	
	@Override
	public String toString() {
		return String.format("Name of the Student --> %s \n", this.name);
	}
	
	

}

class Studentdetails {
	/*public static Details maxmarks(Details[] nm) {
		int idx = 0;
		double max = nm[idx].Avg_marks();

		for (int i = 0; i < 3; i++) {
			if (max < nm[i].Avg_marks()) {
				idx = i;
				max = nm[i].Avg_marks();
			}
		}
		return nm[idx];

	}
	*/

	public static void main(String[] args) {
		Details[] stud = new Details[4];
		stud[0] = new Details(101, "Sherlock", 80,95, 89);
		stud[1]= new Details(102, "John", 55, 95, 79);
		stud[2] = new Details(103, "Holmes", 65, 35, 97);
		stud[3] = new Details(104,"hawk", 60, 95, 97);

		//Details[] nm = { d, e, f };
		//Details sd = maxmarks(nm);
		//System.out.println("Student with maximum Average marks of " + sd.Avg_marks() + "---> " + sd);
		
		
		facebook fb = new facebook();
		System.out.println("<--------Students Hired by Facebook-------->\n");
		fb.hiringcondition(stud);
		//System.out.println(Arrays.toString(stud));
		
		Oneplus op = new Oneplus();
		System.out.println("<------Students hired by Oneplus----->\n");
		op.hiringcondition(stud);
		//System.out.println(Arrays.toString(stud));
		
		Microsoft mc = new Microsoft();
		System.out.println("<-----Students hired by MIcrosoft----->\n");
		mc.hiringcondition(stud);
		
		Apple ap = new Apple();
		System.out.println("<-------Students hired by Apple-------->\n");
		ap.hiringcondition(stud);
		
	}
}
