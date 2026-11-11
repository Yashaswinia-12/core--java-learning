package inheritance2;

class Employee{
    int employeeId;
    String employeeName;
    double salary;

    Employee(int employeeId,String employeeName,double salary ){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }

    void displayEmployeeDetails(){
        System.out.println("EMPLOYEE ID:"+employeeId);
        System.out.println("EMPLOYEE NAME:"+employeeName);
        System.out.println("SALARY:"+salary);

    }

    void CalculateSalary(){
        System.out.println("Anuual salary:"+(salary*12));
    }
}

class Developer extends Employee{
    String ProgrammingLanguage;

    Developer(int employeeId,String employeeName,double salary,String ProgrammingLanguage){
        super(employeeId,employeeName,salary);
        this.ProgrammingLanguage=ProgrammingLanguage;
        
    }
    void displayDeveloperDetails(){
        System.out.println("ProgrammingLanguage:"+ProgrammingLanguage);
    }
}

public class main2 {
    public static void main(String[] args) {
        Developer d=new Developer(100,"Yashaswini",50000,"java");
        d.displayEmployeeDetails();
        d.CalculateSalary();
        d.displayDeveloperDetails();
        
    }

}
