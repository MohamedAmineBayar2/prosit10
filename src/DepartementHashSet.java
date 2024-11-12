import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private List<Departement> departements;

    public DepartementHashSet() {
        departements = new ArrayList<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);

    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);

    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> DepartementsTriee = new TreeSet<>((d1, d2) -> (d1.getId()- d2.getId()));
        DepartementsTriee.addAll(departements);
        return DepartementsTriee;
    }


}
