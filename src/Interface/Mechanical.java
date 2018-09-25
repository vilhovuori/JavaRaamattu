package Interface;

public class Mechanical implements College{
    @Override
    public void exam() {
        System.out.println("Mecha ezxam will be in Feb");
    }

    @Override
    public void score() {
        System.out.println("Mecha scores will be in Mar");
    }
}
