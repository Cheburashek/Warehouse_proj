import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {

	
	public MainFrame(String name) {
		super(name);
		setLayout(new BorderLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				Producent p = new Producent();
				CMagazyn cm = CMagazyn.getInstance();
				Konsument k = new Konsument();
				
				for (int i = 0; i < 10; i++) {
					p.addProduct();
				}
				
				MainFrame mf = new MainFrame("Magazyn");
				JButton kupButton = new JButton("KUPUJ");
				JLabel label1 = new JLabel();
				label1.setSize(mf.WIDTH,40);
				label1.setHorizontalAlignment(SwingConstants.CENTER);
				JTextArea textarea = new JTextArea("Zawartoœæ Magazynu: "+ cm.toString());
				textarea.setSize(mf.WIDTH,520);
				
				mf.add(kupButton,BorderLayout.SOUTH);
				mf.add(label1,BorderLayout.NORTH);
				mf.add(textarea,BorderLayout.CENTER);
				kupButton.addActionListener(new ActionListener()
				{
					  public void actionPerformed(ActionEvent e)
					  {
						int x = k.buyProduct();
					    label1.setText("kupiony produkt: "+x);
					    textarea.setText("Zawartoœæ Magazynu: "+ cm.toString());
					  }
					});
			}
		});

	}
}