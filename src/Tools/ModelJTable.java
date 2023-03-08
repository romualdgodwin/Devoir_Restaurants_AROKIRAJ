package Tools;

import Entities.Carte;
import Entities.Menu;
import Entities.Plat;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel {
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }


    // A compléter ici

    public void loadDatasCartes(ArrayList<Carte> lesCartes) {
        columns = new String[]{"Numéro", "Nom"};
        rows = new Object[lesCartes.size()][2];
        int i = 0;
        for (Carte crt : lesCartes) {
            rows[i][0] = crt.getIdCarte();
            rows[i][1] = crt.getNomCarte();
            i++;
        }
        fireTableChanged(null);
    }

    public void loadDatasMenus(ArrayList<Menu> lesMenus) {
        columns = new String[]{"Numéro", "Nom"};
        rows = new Object[lesMenus.size()][2];
        int i = 0;
        for (Menu mns : lesMenus) {
            rows[i][0] = mns.getIdMenu();
            rows[i][1] = mns.getNomMenu();
            i++;
        }
        fireTableChanged(null);
    }

    public void loadDatasPlats(ArrayList<Plat> lesPlats) {
        columns = new String[]{"Numéro", "Nom", "Note"};
        rows = new Object[lesPlats.size()][3];
        int i = 0;
        for (Plat plt : lesPlats) {
            rows[i][0] = plt.getIdPlat();
            rows[i][1] = plt.getNomPlat();
            rows[i][2] = plt.getNotePlat();
            i++;
        }
        fireTableChanged(null);
    }
}






