package Entities;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Menu {
    private int idMenu;
    private String nomMenu;
    private ArrayList<Plat> lesPlats;

    public Menu(int unId, String unNom) {
        idMenu = unId;
        nomMenu = unNom;
        lesPlats = new ArrayList<>();
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getNomMenu() {
        return nomMenu;
    }

    public ArrayList<Plat> getLesPlats() {
        return lesPlats;
    }

    public void AjouterPlat(Plat nouveauPlat) {
        getLesPlats().add(nouveauPlat);
    }

    private DefaultTableModel modelPlats;


    // Cette méthode permet de calculer la note d'un menu
    // En cumulant chaque note de tous les plats du menu
    //******************

    double noteBestPlat = 0;

    double note =0;
    String nomBestPlat = "";


    public int CalculerNote() {
        int note = 0;

        {
            int rowCount = modelPlats.getRowCount();
            int totalNotes = 0;
            for (int i = 0; i < rowCount; i++) {
                double notes = (double) modelPlats.getValueAt(i, 1);
                totalNotes += note;
                if (note > noteBestPlat) {
                    noteBestPlat = note;
                    nomBestPlat = (String) modelPlats.getValueAt(i, 0);
                } else {
                    note = totalNotes / rowCount;
                }
            }
        }

    }




}
