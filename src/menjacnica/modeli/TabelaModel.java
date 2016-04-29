package menjacnica.modeli;

import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import menjacnica.gui.GUIKontroler;

public class TabelaModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LinkedList<String []> redovi = new LinkedList<>();
	
	public void dodajRed(String [] red){
		redovi.add(red);
		fireTableDataChanged();
	}
	
	public void izbrisiRed(int index){
		if(redovi.remove(index) != null){
			JOptionPane.showMessageDialog(GUIKontroler.glavniProzor.getContentPane(), "Uspesno ste izbrisali kurs!");
			GUIKontroler.glavniProzor.dodajTekst("Izbrisan je red " + index + "!");
			fireTableDataChanged();
		}else JOptionPane.showMessageDialog(GUIKontroler.glavniProzor.getContentPane(), "Nije uspelo brisanje!");

	}
	@Override
	public int getColumnCount() {
		return 6;
	}

	@Override
	public int getRowCount() {
		return redovi.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return redovi.get(rowIndex)[columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		switch(column){
		case 0: return "Sifra";
		case 1: return "Skraceni naziv";
		case 2: return "Prodajni";
		case 3: return "Srednji";
		case 4: return "Kupovni";
		case 5: return "Naziv";
		default: return "N/N";
		}
	}
}
