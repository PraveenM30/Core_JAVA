package JAVA.Constructor;

public class CopyConstructor {
    String name;
    int a;

    CopyConstructor(String name,int a){
        this.name=name;
        this.a=a;
    }

    //copy constructor
    CopyConstructor(CopyConstructor obj2){
        this.name=obj2.name;
        this.a= obj2.a;
    }
}

class Runner1{
    public static void main(String[] args) {
        CopyConstructor c=new CopyConstructor("Test",1);
        System.out.println(c.name+c.a);

        CopyConstructor c1=new CopyConstructor(c);
        System.out.println(c1.name+c1.a);
    }
}
