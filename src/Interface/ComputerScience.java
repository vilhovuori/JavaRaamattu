package Interface;

public class ComputerScience implements College {
    @Override
    public void exam() {
        System.out.println("ComputerScience ezxam will be in Dec");
    }

    @Override
    public void score() {
        System.out.println("ComputerScience score scores avarage");

    }
    public void games(){
        System.out.println("Let the games start now");
    }
}
