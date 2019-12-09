package OOPConsepts;

public class FunctionInJava {

	public static void main(String[] args) {

		FunctionInJava obj = new FunctionInJava();

		obj.Test();

		int e = obj.division(100, 50);
		System.out.println(e);

		String u = obj.pqr();
		System.out.println(u);

	}

	public void Test() {                     //No I/P No O/P
		System.out.println("test method");
	}

	public String pqr() {                    //No I/P have O/P
		System.out.println("pqr method");
		String t = "abc";
		String y = "xyz";
		String u = t + y;

		return u;
	}

	public int division(int q, int w) {       //have I/P & O/P
		System.out.println("division method");
		int e = q / w;

		return e;

	}

}
