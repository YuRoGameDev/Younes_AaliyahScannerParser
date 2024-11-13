public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("C:\\\\Users\\\\cscharff\\\\eclipse-workspace\\\\ScannerSolution\\\\src\\\\prog1.jay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}