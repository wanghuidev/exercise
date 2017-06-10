package user.testinterface;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/5/12.
 */
public class EmployeeSort {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("a",13000);
        staff[1] = new Employee("b",10000);
        staff[2] = new Employee("c",15000);
        Arrays.sort(staff);
        for(Employee e:staff)
            System.out.println("name="+e.getName()+", salary="+e.getSalary());

    }
}


