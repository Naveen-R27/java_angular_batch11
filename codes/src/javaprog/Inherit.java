package javaprog;

class car{
	public int engine() {
		//System.out.println("BSV4 ENGINE");
		return 1;
	}
}

class Bmw extends car{
	public int Type() {
		//System.out.println("Blue core engine");
		return 2;
	}
}



public class Inherit {
	public static void main(String[] args) {
		Bmw b = new Bmw();
		Bmw c = (Bmw) new car();
		c.engine();
		c.Type();
	}

}