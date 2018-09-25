package Interface;

public class CollegeTest {

    public static void main(String[] args) {

        College c=new ComputerScience();
        c.exam();
        c.score();
        ((ComputerScience) c).games();

        College d= new Mechanical();
        d.exam();
    }
}
