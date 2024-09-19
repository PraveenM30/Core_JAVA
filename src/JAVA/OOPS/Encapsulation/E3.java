package JAVA.OOPS.Encapsulation;

public class E3 {

    private String schoolName="GCS";
    private String className;

    public String getSchoolNAme() {
        return schoolName;
    }



    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

   E3(String classname){
      //  this.schoolName=Schoolname;
        this.className=classname;
   }

}

class runner5{
    public static void main(String[] args) {
        E3 e=new E3("8th");
        System.out.println(e.getClassName());
        e.setClassName("12th");
        System.out.println(e.getClassName()+" "+e.getSchoolNAme());
    }
}
