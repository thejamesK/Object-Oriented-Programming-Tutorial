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
        person [2] = new Worker("Agata", "Krawczyk", 15000);

        
        for(Person people: person)
        {
            if(people instanceof Worker)
            {
                ((Worker)people).getDescription();
            }
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
    
    void work()
    {
        System.out.println("I'm working!");
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
