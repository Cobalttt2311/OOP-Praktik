import com.jtk.polban.football.*;

public class DreamTeam {
    public static void main(String[] args) throws Exception {
    System.out.println("====================================================");
    System.out.println("               Football Dream Team                ");
    System.out.println("====================================================");
    Midfielder m = new Midfielder("Pep Guardiola", 5);
    m.play();
    m.showPosition();
    m.status();
    m.strategy();
    m.trainPlayers();
    m.leadTeam();
    m.motivatePlayer();
    System.out.println("====================================================");
    Striker s = new Striker("Marco Van Basten", 9);
    s.play();
    s.showPosition();
    s.status();
    System.out.println("====================================================");
    Defender d = new Defender("Virgil Van dijk", 4);
    d.play();
    d.showPosition();   
    d.status();
    System.out.println("====================================================");
    Goalkeeper g = new Goalkeeper("Thiabut Courtois", 1);
    g.play();
    g.showPosition();
    g.status();
    }
}
