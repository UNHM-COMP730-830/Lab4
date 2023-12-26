import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab4 {

	private JFrame frmPizzaBuilder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab4 window = new Lab4();
					window.frmPizzaBuilder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lab4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPizzaBuilder = new JFrame();
		frmPizzaBuilder.setTitle("Pizza Builder");
		frmPizzaBuilder.setBounds(100, 100, 456, 599);
		frmPizzaBuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzaBuilder.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 416, 550);
		frmPizzaBuilder.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane1 = new JLayeredPane();
		tabbedPane.addTab("Pizza Menu", null, layeredPane1, null);
		
		JLabel lblPizza1 = new JLabel("Big Cheese");
		lblPizza1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPizza1.setBounds(10, 10, 200, 30);
		layeredPane1.add(lblPizza1);
		
		JButton btnMake1 = new JButton("Make");
		btnMake1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenuTab tab = new PizzaMenuTab();
				tab.makeBigCheesePizza();
			}
		});
		btnMake1.setBounds(270, 10, 70, 24);
		layeredPane1.add(btnMake1);
		
		JLabel lblPizza2 = new JLabel("Classic Peperoni");
		lblPizza2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPizza2.setBounds(10, 90, 200, 30);
		layeredPane1.add(lblPizza2);
		
		JTextArea textAreaPizza1 = new JTextArea();
		textAreaPizza1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaPizza1.setText("Extra cheese. Nothing else.");
		textAreaPizza1.setBounds(10, 40, 250, 50);
		layeredPane1.add(textAreaPizza1);
		
		JTextArea textAreaPizza2 = new JTextArea();
		textAreaPizza2.setText("Generous amount of the best quality \r\npeperoni. Everyone's favorite.");
		textAreaPizza2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaPizza2.setBounds(10, 120, 250, 50);
		layeredPane1.add(textAreaPizza2);
		
		JLabel lblPizza3 = new JLabel("Meat Lovers");
		lblPizza3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPizza3.setBounds(10, 170, 200, 30);
		layeredPane1.add(lblPizza3);
		
		JTextArea textAreaPizza3 = new JTextArea();
		textAreaPizza3.setText("Peperoni, bacon, and sausage meat\r\nin one pizza.");
		textAreaPizza3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaPizza3.setBounds(10, 200, 250, 50);
		layeredPane1.add(textAreaPizza3);
		
		JLabel lblPizza4 = new JLabel("Buffalo Chicken");
		lblPizza4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPizza4.setBounds(10, 250, 200, 30);
		layeredPane1.add(lblPizza4);
		
		JTextArea textAreaPizza4 = new JTextArea();
		textAreaPizza4.setText("Hot and spicy chicken.");
		textAreaPizza4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaPizza4.setBounds(10, 280, 250, 50);
		layeredPane1.add(textAreaPizza4);
		
		JLabel lblPizza5 = new JLabel("Veggie");
		lblPizza5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPizza5.setBounds(10, 330, 200, 30);
		layeredPane1.add(lblPizza5);
		
		JTextArea textAreaPizza5 = new JTextArea();
		textAreaPizza5.setText("Hot and spicy checkin.");
		textAreaPizza5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaPizza5.setBounds(10, 360, 250, 50);
		layeredPane1.add(textAreaPizza5);
		
		JTextArea textAreaPizza6 = new JTextArea();
		textAreaPizza6.setText("Who said pinapples and pizza go\r\ntogether? Comes with Chef's sauce.");
		textAreaPizza6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaPizza6.setBounds(10, 440, 250, 50);
		layeredPane1.add(textAreaPizza6);
		
		JLabel lblPizza6 = new JLabel("Hawiian");
		lblPizza6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPizza6.setBounds(10, 410, 200, 30);
		layeredPane1.add(lblPizza6);
		
		JButton btnMake2 = new JButton("Make");
		btnMake2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenuTab tab = new PizzaMenuTab();
				tab.makeClassicPeperoniPizza();
			}
		});
		btnMake2.setBounds(270, 90, 70, 24);
		layeredPane1.add(btnMake2);
		
		JButton btnMake3 = new JButton("Make");
		btnMake3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenuTab tab = new PizzaMenuTab();
				tab.makeMeatLoversPizza();
			}
		});
		btnMake3.setBounds(270, 170, 70, 24);
		layeredPane1.add(btnMake3);
		
		JButton btnMake4 = new JButton("Make");
		btnMake4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenuTab tab = new PizzaMenuTab();
				tab.makeBuffaloChickenPizza();
			}
		});
		btnMake4.setBounds(270, 250, 70, 24);
		layeredPane1.add(btnMake4);
		
		JButton btnMake5 = new JButton("Make");
		btnMake5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenuTab tab = new PizzaMenuTab();
				tab.makeVeggiePizza();
			}
		});
		btnMake5.setBounds(270, 330, 70, 24);
		layeredPane1.add(btnMake5);
		
		JButton btnMake6 = new JButton("Make");
		btnMake6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaMenuTab tab = new PizzaMenuTab();
				tab.makeHawaiianPizza();
			}
		});
		btnMake6.setBounds(270, 410, 70, 24);
		layeredPane1.add(btnMake6);
		
		JLayeredPane layeredPane2 = new JLayeredPane();
		tabbedPane.addTab("Order List", null, layeredPane2, null);
		
		JLabel lblOrder1 = new JLabel("Order #1");
		lblOrder1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrder1.setBounds(10, 10, 200, 30);
		layeredPane2.add(lblOrder1);
		
		JTextArea textAreaOrder1 = new JTextArea();
		textAreaOrder1.setText("Large pizza with two sides.");
		textAreaOrder1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaOrder1.setBounds(10, 40, 250, 24);
		layeredPane2.add(textAreaOrder1);
		
		JLabel lblOrder2 = new JLabel("Order #2");
		lblOrder2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrder2.setBounds(10, 90, 200, 30);
		layeredPane2.add(lblOrder2);
		
		JLabel lblOrder3 = new JLabel("Order #3");
		lblOrder3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrder3.setBounds(10, 170, 200, 30);
		layeredPane2.add(lblOrder3);
		
		JLabel lblOrder4 = new JLabel("Order #4");
		lblOrder4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrder4.setBounds(10, 250, 200, 30);
		layeredPane2.add(lblOrder4);
		
		JTextArea textAreaOrder2 = new JTextArea();
		textAreaOrder2.setText("Midium pizza delivery.");
		textAreaOrder2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaOrder2.setBounds(10, 120, 250, 24);
		layeredPane2.add(textAreaOrder2);
		
		JTextArea textAreaOrder3 = new JTextArea();
		textAreaOrder3.setText("Large veggie pizza with three sides.");
		textAreaOrder3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaOrder3.setBounds(10, 200, 250, 24);
		layeredPane2.add(textAreaOrder3);
		
		JTextArea textAreaOrder4 = new JTextArea();
		textAreaOrder4.setText("Free delivery.");
		textAreaOrder4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaOrder4.setBounds(10, 280, 250, 24);
		layeredPane2.add(textAreaOrder4);
		
		JButton btnView1 = new JButton("View");
		btnView1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderListTab tab = new OrderListTab();
				tab.viewOrder1();
			}
		});
		btnView1.setBounds(250, 10, 70, 24);
		layeredPane2.add(btnView1);
		
		JButton btnView2 = new JButton("View");
		btnView2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderListTab tab = new OrderListTab();
				tab.viewOrder2();
			}
		});
		btnView2.setBounds(250, 90, 70, 24);
		layeredPane2.add(btnView2);
		
		JButton btnView3 = new JButton("View");
		btnView3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderListTab tab = new OrderListTab();
				tab.viewOrder3();
			}
		});
		btnView3.setBounds(250, 170, 70, 24);
		layeredPane2.add(btnView3);
		
		JButton btnView4 = new JButton("View");
		btnView4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderListTab tab = new OrderListTab();
				tab.viewOrder4();
			}
		});
		btnView4.setBounds(250, 250, 70, 24);
		layeredPane2.add(btnView4);
	}
}
