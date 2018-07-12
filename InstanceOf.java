package pkginstanceof;

/**
 *
 * @author Shabbadoo
 */
public class InstanceOf {

    public static void main(String[] args) 
    {
        Person[] person = new Person[4];
        person [0] = new Worker("Jakub", "Krawczyk", 5000);
        person [1] = new Student("Agnieszka", "Sagan");
        
        for(Person people: person)
        {
            if(people instanceof Person)
            people.getDescription();
            else
                break;
        }
    }

    
}

abstract class Person
{
    String name;
    String surname;
    
    Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    abstract void getDescription();
}

class Worker extends Person
{
    double salary;
    
    Worker(String name, String surname, double salary)
    {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    void getDescription() 
    {
        System.out.println("I'm worker.");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Salary: " + salary);
    }

}

class Student extends Person
{
    Student(String name, String surname)
    {
        super(name, surname);
    }

    @Override
    void getDescription() 
    {
        System.out.println("I'm student.");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }
    
}
