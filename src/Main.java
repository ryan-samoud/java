import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe=new SocieteArrayList();
        DepartementHashSet departements=new DepartementHashSet();
        AffectationHashMap affectations = new AffectationHashMap();
        ProductManagement pm = new ProductManagement();
        List<Product> products = new ArrayList<>();
        Employe meme=new Employe(1, "big", "chungus", "khedma", 10);
        Employe idc=new Employe(3, "who", "cares", "khedma", 5);
        Employe ryan=new Employe(2, "Samoud", "Ryan", "Esprit", 1);

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
        TreeMap<Employe, Departement> sorted = affectations.trierMap();

        System.out.println("Map triée par id :");
        for (Map.Entry<Employe, Departement> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNomDepartement());
        }
        products.add(new Product(3, "table", 2000));
        products.add(new Product(1, "chair", 200));
        products.add(new Product(2, "PC", 1500));
        System.out.println("display all products");
        pm.displayProducts(products, System.out::println);
        System.out.println("display products with price > 1000");
        pm.displayProductsByFilter(products, p -> p.getPrix() > 1000, System.out::println);
        System.out.println("return product names");
        String names = pm.returnProductsNames(products, Product::getNom);
        System.out.println("names: " + names);
        System.out.println("create a product");
        Supplier<Product> sup = () -> new Product(10, "Laptop", 1500);
        Product newProduct = pm.createProduct(sup);
        System.out.println("Created: " + newProduct);
        System.out.println("products sorted by ID");
        Comparator<Product> compById = Comparator.comparingInt(Product::getId);
        List<Product> sortedById = pm.sortProductsById(products, compById);
        sortedById.forEach(System.out::println);
        System.out.println("stream of products");
        Stream<Product> stream = pm.convertToStream(products);
        stream.forEach(System.out::println);
    }
}