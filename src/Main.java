public class Main {
    public static void main(String[] args) {
        // Réservation de 100 emplacements
        Worker[] workers = new Worker[100];
        int count = 0; // Compteur pour suivre le nombre réel d'employés

        // Ajout d'exemples d'employés
        workers[count++] = new Worker("Alice", 2500, 300);
        workers[count++] = new Worker("Bob", 3000, 500);
        workers[count++] = new Worker("Charlie", 2100, 150);

        double companyTotalSalary = 0;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Nom", "Salaire de Base", "Complément", "Salaire Total");
        System.out.println("---------------------------------------------------------------");

        // Parcours uniquement des emplacements réellement utilisés
        for (int i = 0; i < count; i++) {
            Worker w = workers[i];
            double total = w.getTotalSalary();
            companyTotalSalary += total;

            System.out.printf("%-15s %-15.2f %-15.2f %-15.2f%n",
                    w.getName(), w.getBaseSalary(), w.getComplement(), total);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Masse salariale totale de l'entreprise : %.2f%n", companyTotalSalary);
    }
}