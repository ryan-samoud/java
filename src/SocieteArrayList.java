import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes=new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return listeEmployes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        listeEmployes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int cmpDept = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (cmpDept == 0) {
                    return Integer.compare(e1.getGrade(), e2.getGrade());
                }
                return cmpDept;
            }
        });
    }
}
