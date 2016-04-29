package menjacnica.modeli;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

public class TabelaModel extends AbstractTableModel{
	LinkedList<String []> redovi = new LinkedList<>();
	
	public void dodajRed(String [] red){
		redovi.add(red);
		fireTableDataChanged();
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
