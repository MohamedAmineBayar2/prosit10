public class Employee implements Comparable<Employee> {
    int id ;
     String nom ;
     String prenom ;
     String nomdep;
     int grade ;

    public Employee() {
    }

    public Employee(int id, String nom, String prenom, String nomdep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomdep = nomdep;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomdep() {
        return nomdep;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;

            return this.id == employee.id && (this.nom != null && this.nom.equals(employee.nom));
        }

        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomdep='" + nomdep + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

}
