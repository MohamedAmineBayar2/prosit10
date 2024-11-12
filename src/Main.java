import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();

        // Création et ajout d'employés
        Employee emp1 = new Employee(1, "Dupont", "Jean", "Informatique", 3);
        Employee emp2 = new Employee(2, "Martin", "Claire", "Ressources Humaines", 2);
        Employee emp3 = new Employee(3, "Durand", "Paul", "Informatique", 4);
        Employee emp4 = new Employee(4, "Blanc", "Sophie", "Marketing", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);

        // Affichage des employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche d'un employé par nom
        System.out.println("\nRecherche d'un employé par nom ('Martin') :");
        if (societe.rechercherEmploye("Martin")) {
            System.out.println("L'employé avec le nom 'Martin' a été trouvé.");
        } else {
            System.out.println("Aucun employé avec le nom 'Martin' n'a été trouvé.");
        }

        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé : " + emp2);
        societe.supprimerEmploye(emp2);
        System.out.println("Liste des employés après suppression :");
        societe.displayEmploye();

        // Tri des employés par ID
        System.out.println("\nTri des employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri des employés par nom de département et grade
        System.out.println("\nTri des employés par nom de département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
        ////////////////////////////////////////////////////////////////////////
        DepartementHashSet departementHashSet = new DepartementHashSet();

        //
        Departement dep1 = new Departement(1, 10, "Marketing");
        Departement dep2 = new Departement(2, 50," Finance");
        Departement dep3 = new Departement(3, 30, "HR");

        //
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        //
        System.out.println("All Departments:");
        departementHashSet.displayDepartement();

        //
        System.out.println("\nSearching for 'Finance': " + departementHashSet.rechercherDepartement("Finance"));
        System.out.println("Searching for 'IT': " + departementHashSet.rechercherDepartement("IT"));

        //
        System.out.println("\nSearching for dep1: " + departementHashSet.rechercherDepartement(dep1));

        //
        departementHashSet.supprimerDepartement(dep2);
        System.out.println("\nAfter removing Finance department:");
        departementHashSet.displayDepartement();

        //
        System.out.println("\nDepartments sorted by ID:");
        TreeSet<Departement> sortedDepartments = departementHashSet.trierDepartementById();
        for (Departement dep : sortedDepartments) {
            System.out.println(dep);
    }
}
}
