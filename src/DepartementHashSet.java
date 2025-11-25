import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    public Set<Departement> departements=new HashSet<>();



    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparingInt(Departement::getId));
        System.out.println("Tri par id :");
        list.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparing(Departement::getNomDepartement).thenComparingInt(Departement::getNombreEmployes));
        System.out.println("Tri par NomEtNombreEmployes :");
        list.forEach(System.out::println);
    }
}
