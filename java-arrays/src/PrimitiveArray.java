
public class PrimitiveArray {

	public static void main(String[] args) {
		char[] characters = createArray();
		printArrayElements(characters);
	}

	public static char[] createArray() {
		char[] s;
		s = new char[26];
		
		for (int i = 0 ; i < 26; i ++) {
			s[i] = (char)('A'+i);
		}
		return s;
	}
	
	public static void printArrayElements(char[] list) {
		for (int i = 0 ; i < list.length;i++) {
			System.out.println(list[i]);
		}
	}
}
