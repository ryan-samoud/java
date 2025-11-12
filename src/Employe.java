public class Employe {
    private String nom, prenom, nomDepartement;
    private int id, grade;

    public Employe(){}
    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj.getClass() == Employe.class){
            Employe employe=(Employe) obj;
            return  this.getGrade()==employe.getGrade()  && this.getId()==employe.getId() && this.getNom().equals(employe.getNom()) && this.getPrenom().equals(employe.getPrenom()) && this.getNomDepartement().equals(employe.getNomDepartement());
        }
        return false;
    }
    @Override
    public String toString() {
        return "nom:" +  nom + ", prenom:" + prenom + ", id:" + id + ", grade:" + grade + ", nomDepartement:" + nomDepartement;
    }
}
