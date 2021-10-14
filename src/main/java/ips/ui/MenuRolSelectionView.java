package ips.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuRolSelectionView extends JFrame{
	
	private JPanel panelTexto;
	private JPanel panelBotones;
	private JLabel label;
	private JButton btnOrganizador;
	private JButton btnCorredor;
	private JPanel panelSur;
	private JPanel panelNorte;
	private JPanel panelBotonesInterior;
	
	
	public MenuRolSelectionView() {
		setBounds(100, 100, 582, 427);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		getContentPane().add(getPanelTexto());
		getContentPane().add(getPanelBotones());
	}
	
	
	private JPanel getPanelTexto() {
		if (panelTexto == null) {
			panelTexto = new JPanel();
			panelTexto.setBackground(Color.WHITE);
			panelTexto.add(getLabel());
		}
		return panelTexto;
	}
	private JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			panelBotones.setBackground(Color.WHITE);
			panelBotones.setLayout(new BorderLayout(22, 30));
			panelBotones.add(getPanelSur(), BorderLayout.SOUTH);
			panelBotones.add(getPanel_1_1(), BorderLayout.NORTH);
			panelBotones.add(getPanelBotonesInterior(), BorderLayout.CENTER);
		}
		return panelBotones;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Elige tu rol");
			label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return label;
	}
	public JButton getBtnOrganizador() {
		if (btnOrganizador == null) {
			btnOrganizador = new JButton("Organizador");
			btnOrganizador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnOrganizador;
	}
	public JButton getBtnCorredor() {
		if (btnCorredor == null) {
			btnCorredor = new JButton("Corredor");
			btnCorredor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnCorredor;
	}
	private JPanel getPanelSur() {
		if (panelSur == null) {
			panelSur = new JPanel();
			panelSur.setBackground(Color.WHITE);
		}
		return panelSur;
	}
	private JPanel getPanel_1_1() {
		if (panelNorte == null) {
			panelNorte = new JPanel();
			panelNorte.setBackground(Color.WHITE);
		}
		return panelNorte;
	}
	private JPanel getPanelBotonesInterior() {
		if (panelBotonesInterior == null) {
			panelBotonesInterior = new JPanel();
			panelBotonesInterior.setBackground(Color.WHITE);
			panelBotonesInterior.setLayout(new GridLayout(0, 2, 50, 0));
			panelBotonesInterior.add(getBtnOrganizador());
			panelBotonesInterior.add(getBtnCorredor());
		}
		return panelBotonesInterior;
	}
	
	
}
