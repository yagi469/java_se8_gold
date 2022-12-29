package q55;

public class Printer {
	
	void print(Paper paper) throws EmptyInkException { // line n1
	
	// A.	
//	public void print(Paper paper) throws EmptyInkException {
	
	// B.
//	protected void print(Paper paper) throws Exception {
		
		System.out.println(paper.getContents());
	}
}