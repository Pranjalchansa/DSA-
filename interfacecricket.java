interface Cricket {
    void ipl();
    void psl();
    void bbl();
}
class ICC implements Cricket {
    public void ipl() {
        System.out.println("IPL stands for Indian Premier League");
    }
    public void psl() {
        System.out.println("PSL stands for Pakistan Super League");
    }
    public void bbl() {
        System.out.println("BBL stands for Big Bash League (Australia)");
    }
}
public class interfacecricket {
    public static void main(String[] args) {
        ICC obj = new ICC();
        obj.ipl();
        obj.psl();
        obj.bbl();
    }
}
