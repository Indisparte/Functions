import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class LabelButtonMouseAdapter extends MouseAdapter {
	
		JLabel label;			//il label da trasformare in button
		ImageIcon activeIcon;	//l'icona cliccabile
		ImageIcon inactiveIcon;	//l'icona standard
		
		
		public LabelButtonMouseAdapter(JLabel label, String pathActiveIcon, String pathInactiveIcon) {
			this.label = label;
			this.activeIcon = new ImageIcon(Prova.class.getResource(pathActiveIcon));
			this.inactiveIcon = new  ImageIcon(Prova.class.getResource(pathInactiveIcon));
			
			label.setIcon(inactiveIcon);
			
		}
		public void mouseEntered(MouseEvent e) {
			label.setIcon(null);
			label.setIcon(activeIcon);

		}
		public void mouseExited(MouseEvent e) {
			label.setIcon(null);
			label.setIcon(inactiveIcon);
		}
		
	}