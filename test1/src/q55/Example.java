package q55;

public class Example {

	public static void main(String[] args) throws EmptyInkException, Exception {
	
		Printer printer = new ColorPrinter();
		Paper paper = new Paper();
		paper.setContents("Hello");
		printer.print(paper);
	}
}