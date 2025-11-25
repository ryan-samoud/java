public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe=new SocieteArrayList();
        DepartementHashSet departements=new DepartementHashSet();
        AffectationHashMap affectations = new AffectationHashMap();
        Employe meme=new Employe(1, "big", "chungus", "khedma", 10);
        Employe idc=new Employe(2, "who", "cares", "khedma", 5);
        Employe ryan=new Employe(3, "Samoud", "Ryan", "Esprit", 1);

        Departement khedma = new Departement(1, "khedma", 2);
        Departement Esprit = new Departement(2, "Esprit", 1);

        societe.ajouterEmploye(meme);
        societe.ajouterEmploye(idc);
        societe.ajouterEmploye(ryan);

        societe.displayEmploye();

        System.out.println("Tri naturelle ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri personalés");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        departements.ajouterDepartement(new Departement(1,"khedma",2));
        departements.ajouterDepartement(new Departement(2,"Esprit",1));

        departements.afficherDepartements();

        System.out.println("Esprit?: "+departements.rechercherDepartement("Esprit"));

        departements.trierDepartementsParId();
        departements.trierDepartementsParNomEtNombreEmployes();

        affectations.ajouterEmployeDepartement(meme, khedma);
        affectations.ajouterEmployeDepartement(idc, khedma);
        affectations.ajouterEmployeDepartement(ryan, Esprit);
        System.out.println("hashmap(affichage (b)):");
        affectations.afficherEmployesEtDepartements();
        affectations.ajouterEmployeDepartement(meme, Esprit);
        System.out.println("hashmap(c):");
        affectations.afficherEmployesEtDepartements(); // khedma a été remplacé par Esprit
        affectations.supprimerEmployeEtDepartement(meme, Esprit);
        System.out.println("hashmap(employe)");
        affectations.afficherEmployes();
        System.out.println("hashmap(departement)");
        affectations.afficherDepartements();
    }
}