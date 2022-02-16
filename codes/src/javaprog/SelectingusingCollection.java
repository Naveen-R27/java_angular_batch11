package javaprog;


interface Hcondition{
	public void  Hcondition(Info[] dts);
}

class Samsung implements  Hcondition{

	@Override
	public void  Hcondition(Info[] stud) {
		Info [] eligible = new Info[stud.length];
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

class Oppo implements  Hcondition{

	@Override
	public void  Hcondition(Info[] stud) {
		Info [] eligible = new Info[stud.length];
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

class Amazon implements  Hcondition{

	@Override
	public void  Hcondition(Info[] stud) {
		Info [] eligible = new Info[stud.length];
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

class Redmi implements  Hcondition{

	@Override
	public void  Hcondition(Info[] stud) {
		Info [] eligible = new Info[stud.length];
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


class Info {
	private int id;
	private String name;
	private int cmarks;
	private int pmarks;
	private int mmarks;

	public  Info(int id, String name, int cmarks, int pmarks, int mmarks) {
		this.id = id;
		this.name = name;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}
	
	public Info() {
		
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

class SelectingusingCollection {
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
		Info[] stud = new Info[4];
		stud[0] = new Info(101, "Sherlock", 80,95, 89);
		stud[1]= new Info(102, "John", 55, 95, 79);
		stud[2] = new Info(103, "Holmes", 65, 35, 97);
		stud[3] = new Info(104,"hawk", 60, 95, 97);

		//Details[] nm = { d, e, f };
		//Details sd = maxmarks(nm);
		//System.out.println("Student with maximum Average marks of " + sd.Avg_marks() + "---> " + sd);
		
		
		Samsung fb = new Samsung();
		System.out.println("<--------Students Hired by Facebook-------->\n");
		fb. Hcondition(stud);
		//System.out.println(Arrays.toString(stud));
		
		Redmi op = new Redmi();
		System.out.println("<------Students hired by Oneplus----->\n");
		op. Hcondition(stud);
		//System.out.println(Arrays.toString(stud));
		
		Oppo mc = new Oppo();
		System.out.println("<-----Students hired by MIcrosoft----->\n");
		mc. Hcondition(stud);
		
		Amazon ap = new Amazon();
		System.out.println("<-------Students hired by Apple-------->\n");
		ap. Hcondition(stud);
		
	}
}
