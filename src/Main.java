//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe=new SocieteArrayList();

        Employe meme=new Employe(1, "big", "chungus", "khedma", 10);
        Employe idc=new Employe(2, "who", "cares", "meme", 5);
        Employe ryan=new Employe(3, "Samoud", "Ryan", "Esprit", 1);

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
    }
}