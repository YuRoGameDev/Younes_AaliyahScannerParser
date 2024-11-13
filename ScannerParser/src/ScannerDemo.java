/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "C:\\Users\\youne\\Desktop\\Scanner\\ScannerParser\\src\\prog1.jay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED
			Token tk = ts.nextToken();
			if (tk.getValue().isEmpty()) {
				continue;
			}
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}

	}
}
