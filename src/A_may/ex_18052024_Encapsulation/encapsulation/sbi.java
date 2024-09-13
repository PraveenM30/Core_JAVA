package A_may.ex_18052024_Encapsulation.encapsulation;

public class sbi {
    private String Username="praveen";
    private long accNo=1234567890l;
    private String password="1234";
    private double balance=100.78;




    public String getUsername(){
        return this.Username;
    }
    public String getPassword(){
        return this.password;
    }
    public double getbalance(){
        return this.balance;
    }
    public long getAccNo(){
        return this.accNo;
    }

    public void setUsername(String username) {
        this.Username=username;
    }
    public void setPassword(String password1) {
        this.password=password1;
    }
}
class runner{
    public static void main(String[] args) {
        sbi s=new sbi();
        System.out.println( s.getUsername());
        System.out.println( s.getAccNo());
        System.out.println( s.getbalance());
        System.out.println( s.getPassword());
        s.setUsername("praveen M");
        System.out.println( s.getUsername());
        s.setPassword("praveen@123");
        System.out.println( s.getPassword());

    }
}
