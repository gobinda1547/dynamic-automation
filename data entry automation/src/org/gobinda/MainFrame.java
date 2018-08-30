package org.gobinda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JList;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField addRulesTextField;
	private JTextField showPointAndColorTextField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 477);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("APPLY", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));

		// String[] availableRules = {"A","A","A","A","A","A","A"};
		JComboBox<String> allRulesInApplyComboBox = new JComboBox<>();
		panel.add(allRulesInApplyComboBox, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JButton btnNewButton = new JButton("START");
		panel.add(btnNewButton, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("SETTINGS", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));

		JComboBox<String> allRulesInSettingComboBox = new JComboBox<String>();
		panel_4.add(allRulesInSettingComboBox);

		addRulesTextField = new JTextField();
		panel_4.add(addRulesTextField);
		addRulesTextField.setColumns(10);

		JButton deleteRuleButton = new JButton("DELETE");
		panel_4.add(deleteRuleButton);

		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));

		showPointAndColorTextField = new JTextField();
		panel_6.add(showPointAndColorTextField);
		showPointAndColorTextField.setColumns(10);

		JButton updateRuleButton = new JButton("UPDATE");
		panel_6.add(updateRuleButton);

		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, BorderLayout.WEST);
		panel_7.setLayout(new BorderLayout(0, 0));

		JButton addSingleRule = new JButton("New button");
		panel_7.add(addSingleRule, BorderLayout.SOUTH);

		JScrollPane scrollPane_3 = new JScrollPane();
		panel_7.add(scrollPane_3, BorderLayout.CENTER);

		JList<String> singleRuleList = new JList<String>();
		scrollPane_3.setViewportView(singleRuleList);

		JScrollPane scrollPane_4 = new JScrollPane();
		panel_5.add(scrollPane_4, BorderLayout.CENTER);

		JTextArea textArea_1 = new JTextArea();
		scrollPane_4.setViewportView(textArea_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("INPUT", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.CENTER);

		JTextArea inputTextArea = new JTextArea();
		scrollPane_1.setViewportView(inputTextArea);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("OUTPUT", null, panel_3, null);
		panel_3.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_2 = new JScrollPane();
		panel_3.add(scrollPane_2, BorderLayout.CENTER);

		JTextArea outputTextArea = new JTextArea();
		scrollPane_2.setViewportView(outputTextArea);

	}

}
