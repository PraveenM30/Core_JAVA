package JAVA.OOPS.Encapsulation;

public class E2 {
    private String EmpName = "Manoj";
    private long Empsal = 54000;

    public E2(String name, long sal) {
        this.EmpName = name;
        this.Empsal = sal;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String name) {
        this.EmpName = name;
    }


    public long getEmpsal() {
        return Empsal;
    }

    public void setEmpsal(long sal) {
        this.Empsal = sal;
    }

    void Details(){
        System.out.println("Emp Name is "+ EmpName);
        System.out.println("Emp sal is "+ Empsal);
    }

}

class runner4 {
    public static void main(String[] args) {
        E2 e = new E2("praveen", 29000);
        System.out.println(e.getEmpName());
        e.setEmpName("Sanjay");
        System.out.println("Setted Ename >> "+ e.getEmpName());


        System.out.println(e.getEmpsal());
        e.setEmpsal(1234567890);
        System.out.println("Setted Esal >> "+ e.getEmpsal());

        e.Details();
    }
}
