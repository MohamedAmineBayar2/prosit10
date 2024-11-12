import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {
    private List<Employee> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employee e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
            System.out.println(employes);

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator.comparing(Employee::getNomdep).thenComparing(Employee::getGrade)
        );
    }
}