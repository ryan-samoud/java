public class Departement {
    private int  id;
    private String nomDepartement;
    private int NombreEmployes;

    public Departement(){}
    public Departement(int id, String nomDepartement, int NombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNombreEmployes() {
        return NombreEmployes;
    }
    public void setNombreEmployes(int NombreEmployes) {
        this.NombreEmployes = NombreEmployes;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj.getClass() == Departement.class){
            Departement depart=(Departement) obj;
            return  this.getId()==depart.getId() && this.getNomDepartement().equals(depart.getNomDepartement());
        }
        return false;
    }
    @Override
    public String toString() {
        return "id:" + id + ", nomDepartement:" + nomDepartement + ", NombreEmployes:" + NombreEmployes;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id;
        hash = 89 * hash + nomDepartement.hashCode();
        return hash;
    }
}