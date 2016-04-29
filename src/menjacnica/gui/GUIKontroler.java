package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class GUIKontroler {
	public static MenjacnicaGUI glavniProzor;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavniProzor = new MenjacnicaGUI();
					glavniProzor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void otvoriDodajKursGUI(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li ste sigurni da želite da izađete iz aplikacije?", "Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcija == JOptionPane.YES_OPTION)System.exit(0);
	}
	
	public static void unesiUTabelu(String [] polja){
		glavniProzor.unesiRed(polja);
	}

	public static void dodajKurs(String [] kurs) {
		unesiUTabelu(kurs);
		glavniProzor.dodajTekst("\nSifra: " + kurs[0] + " Skraceni naziv: " + kurs[1] + " Prodajni: " + kurs[2] + " Srednji: " + kurs[3] + " Kupovni: " + kurs[4] + " Naziv: " + kurs[4]);
	}
}
