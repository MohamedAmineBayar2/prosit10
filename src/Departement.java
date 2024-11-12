import java.util.Objects;

public class Departement {
 int id,nbEmployee;
 String nom ;

    public Departement() {
    }

    public Departement(int id, int nbEmployee, String nom) {
        this.id = id;
        this.nbEmployee = nbEmployee;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public int getNbEmployee() {
        return nbEmployee;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNbEmployee(int nbEmployee) {
        this.nbEmployee = nbEmployee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbEmployee=" + nbEmployee +
                ", nom='" + nom + '\'' +
                '}';
    }
}
