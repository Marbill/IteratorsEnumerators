package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* @author marbi */
public class Employees {

    List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        this.employees.addAll(persons);
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }

        }
    }

}
