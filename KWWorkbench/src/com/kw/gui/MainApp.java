package com.kw.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewProject = new JMenuItem("New Project...");
		mnFile.add(mntmNewProject);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		scrollPane.setViewportView(desktopPane);
		desktopPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(171, 73, 189, 72);
		internalFrame.setResizable(true);
		desktopPane.add(internalFrame);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar_1 = new JMenuBar();
		panel.add(menuBar_1, BorderLayout.NORTH);
		
		JButton btnAddFolder = new JButton("Add Folder");
		menuBar_1.add(btnAddFolder);
		
		JButton btnAddFile = new JButton("Add File");
		menuBar_1.add(btnAddFile);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1);
		
		JTree treeProject = new JTree();
		scrollPane_1.setViewportView(treeProject);
		internalFrame.setVisible(true);
	}
}
