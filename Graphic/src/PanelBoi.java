import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBoi extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = 0;
		for (int i = FrameBoi.WINDOW_SIZE / 4; i <= FrameBoi.WINDOW_SIZE / 4 + 160; i += 30) {
			for (int j = FrameBoi.WINDOW_SIZE / 4; j <= FrameBoi.WINDOW_SIZE / 4 + 160; j += 30) {
				if (x++ % 2 == 0) {
					g.drawRect(i, j, 30, 30);
				} else
					g.fillRect(i, j, 30, 30);
			}
			x++;
		}

	}
}
