interface interfejs1{
    void Metoda1();
    void Metoda2();
}

interface interfejs2{
    void Metoda3();
    void Metoda4();
}

interface interfejs3 extends interfejs1, interfejs2{
    void Metoda5();
}

class KlasaNad {
    void Metoda6(){
        System.out.println("Metoda nr. 6");
    }
}

class KlasaPod extends KlasaNad implements interfejs3{


    public void Metoda1() {
        System.out.println("Metoda nr. 1");
    }


    public void Metoda2() {
        System.out.println("Metoda nr. 2 ");
    }


    public void Metoda3() {
        System.out.println("Metoda nr. 3 ");
    }


    public void Metoda4() {
        System.out.println("Metoda nr. 4 ");
    }


    public void Metoda5() {
        System.out.println("Metoda nr. 5 ");
    }
}

public class Main2 {

    public static void test1(interfejs1 pierwszy){
        pierwszy.Metoda1();
    }

    public static void test2(interfejs2 drugi){
        drugi.Metoda3();
    }

    public static void test3(interfejs3 trzeci){
        trzeci.Metoda2();
        trzeci.Metoda3();
        trzeci.Metoda4();
        trzeci.Metoda5();
    }

    public static void main(String[] args)  {
        KlasaPod KP = new KlasaPod();
        test1(KP);
        test2(KP);
        test3(KP);
    }
}