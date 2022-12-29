package q26;

public class Main {

	public static void main(String[] args) {

		try (NetworkMonitor nm = new NetworkMonitor();
			 PacketFilter pf = new PacketFilter()) {
			nm.monitor();
			pf.filter();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
