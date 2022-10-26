package a4disc;

public class Disc4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q1(null);
		run4();
	}
	
	void q1 (String t) {
		String s1 = "Hello";
		
		s1 = t.concat(s1);
		System.out.print(s1);
	}
	
	static int run2() {
		int result = 0;
		int data = 1;
		result = data/result;
		result++;
		data--;
		return result + data;
	}
	
	static int run4() { 
	     int result = 0; 
	     int data = 1; 
	     try { 
	          result++; 
	          data++; 
	     } catch (ArithmeticException ae) { 
	          data--; 
	     } finally { 
	          result++; 
	     } 
	     return result * data; 
	} 

}
