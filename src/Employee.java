class Employee {
    private int empno;
    private String ename;
    private int salary;

    Employee(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEmpno(){
        return empno;
    }

    public int getSalary(){
        return salary;
    }
    public  String getEname(){
        return ename;
    }

    public String toString(){
        return empno + " " + ename + " " + salary;
    }
}


