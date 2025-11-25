import java.util.HashMap;
import java.util.Map;
public class AffectationHashMap {
    Map<Employe, Departement> affectations = new HashMap<>();
    public void ajouterEmployeDepartement(Employe e, Departement d)  {
        affectations.put(e, d);
    }
    public void afficherEmployesEtDepartements()  {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey().getNom() + ":" + entry.getValue().getNomDepartement());
        }
    }
    public void supprimerEmploye(Employe e){
        affectations.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println( e.getNom() + ":" + d.getNomDepartement() + " removed");
        } else {
            System.out.println("doesn't exist");
        }
    }
    public void afficherEmployes(){
        if (affectations.isEmpty()) {
            System.out.println("employe empty");

        }
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }
    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("depart empty");
        }
        for (Departement d : affectations.values()) {
            System.out.println(d.getNomDepartement());
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

}
