package A_may.ex_18052024_Encapsulation.encapsulation;

public class Car {
    private String CarName;
    private int model;
    private long cost;

    Car(String CarNamee,int modell,long costt){
        this.CarName=CarNamee;
        this.model=modell;
        this.cost=costt;
    }

    public String getCarName(){
        return CarName;
    }
    public void setCarName(String carname){
        this.CarName=carname;
    }
    public int getModel(){
        return model;
    }
    public void setModel(int modell){
        if(modell > 1000){
             this.model=modell;
        }
        else{
            System.out.println("pls enter valid model!");
        }
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long costt) {
        if(costt>1500000){
            this.cost = costt;
        }
        else {
            System.out.println("Enter valid cost!");
        }
    }

    void cardetails(){
        System.out.println("Car name -> "+ CarName);
        System.out.println("Car model -> "+ model);
        System.out.println("Car year -> "+ cost);
    }

    public static void main(String[] args) {
        Car c=new Car("Range Rover",2020,1800000);
        c.cardetails();
        c.setCarName("AUDI");
        c.setModel(1);
        c.setCost(1234);
        c.cardetails();
    }
}
