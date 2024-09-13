package A_may.ex_14052024_Constructor;

public class con2 {
    String team;
    String captain;
    String role;
    int battingorder;

    con2(String teamm, String captainn, String rolee, int battingorderr) {
        this.team = teamm;
        this.captain = captainn;
        this.role = rolee;
        this.battingorder = battingorderr;
    }


void Details() {
            System.out.println("team name is ->"+ team);
            System.out.println("captain is ->"+captain);
            System.out.println("role is ->"+role);
            System.out.println("batting order ->"+battingorder);
        }
    }
