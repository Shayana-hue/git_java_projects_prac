import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class employee {
    String name;
    int salary;

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

}

public class comparatorandcomparable {
    public static void main(String a[]) {
        List<employee> emp = new ArrayList<>();
        emp.add(new employee("navin", 20000));
        emp.add(new employee("safdagf", 20000));
        emp.add(new employee("dbvnbma", 287980000));
        emp.add(new employee("ndvchj", 2780000));
        emp.add(new employee("navin", 267000));
        System.out.println(emp);
        System.out.println(emp);
    }

}
