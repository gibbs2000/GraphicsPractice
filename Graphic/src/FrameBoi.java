import javax.swing.JFrame;

public class FrameBoi {
	JFrame j;
	public final static int WINDOW_SIZE = 400;
	PanelBoi p;

	public FrameBoi() {
		j = new JFrame("Frame Boi");
		p = new PanelBoi();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(FrameBoi.WINDOW_SIZE, FrameBoi.WINDOW_SIZE);
		j.setVisible(true);
		j.setResizable(false);
		j.add(p);
	}

	public void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		FrameBoi boi = new FrameBoi();
		boi.print("Kachow");
	}
}
