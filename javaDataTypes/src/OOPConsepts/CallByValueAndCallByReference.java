package OOPConsepts;

public class CallByValueAndCallByReference {
	// before swap
	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 40;
		int y = 50;
		obj.testSum(x, y); // Call by value or pass by value
		System.out.println(obj.testSum(x, y));

		// x & y will create a photo copy of original so it doesn't show error
		// Now the value of a = 40 & b = 50
		
		// before swap
		obj.p = 50;
		obj.q = 60;

		obj.Swap(obj);     //IMP//
		// after swap
		System.out.println("Value of p" +obj.p);
		System.out.println("Value of q" +obj.q);

	}

	public int testSum(int a, int b) {
		a = 10; // Now the value of a = 10 & b = 20
		b = 20; // Always remember the latest value will be considered to result
		int c = a + b;
		return c;

	}

	public void Swap(CallByValueAndCallByReference t) { // Call by reference
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // p = 60
		t.q = temp; // q = 50

	}

}
