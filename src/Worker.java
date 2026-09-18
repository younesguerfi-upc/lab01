public class Worker {
    private String name;
    private double baseSalary;
    private double complement;

    public Worker(String name, double baseSalary, double complement) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }

    // Calcul du salaire total
    public double getTotalSalary() {
        return baseSalary + complement;
    }

    // Getters
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public double getComplement() { return complement; }
}