import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String nome;
    private WorkerLevel level;
    private Double salary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<HourContract>()    ;

    public Worker() {}

    public Worker(String nome, WorkerLevel level, Double salary, Departament departament) {
        this.nome = nome;
        this.level = level;
        this.salary = salary;
        this.departament = departament;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public void income(int year, int month) {
        double soma = salary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_mounth = 1 + calendar.get(Calendar.MONTH);
            if(c_year == year && c_mounth == month) {
                soma += contract.totalValue();
            }
        }
    }

}
