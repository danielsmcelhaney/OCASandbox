package play.daniel.main;

public class Entry {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		/*if(args[0] != null) {
			System.out.println(args[0]);
		}
		if(args[1] != null) {
			System.out.println(args[1]);
		}
		*/
		System.out.println(PreAndPostfix());
	}
	
	private static int PreAndPostfix() {
		int a, result;
		a = 10;
		result = a++ + a;
		result = result - a--;
		result = result + a;
		return result;
	}

}
