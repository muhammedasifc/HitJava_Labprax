
public class CastingExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10; 
		 
		int i=b;// will accept - automatic type promotion
		 
		byte c=i;// will not accept - because lower type cannot be put in higher
		 
		byte d=(byte)i;// Type casting makes it possible to store compatible types.
		 
		byte x=10; 
		byte y=20; 
		 
	//	byte sum= x * y; 
		int mul = x*y;
		System.out.println("Two byte var"+x+"  and "+y+"  multiply in int type result is... "+mul);
		// Error is thrown because when two bytes are used in a arthmetic operation, the result will be intege

	}

}
