interface withoutParametrs {
    void without();
}
interface threeParametrs {
    int three(int a, int b, int c);
}
interface oneParametr {
    void one(String a);
}
interface multiInstruction {
    int multi(int a, int b, int c, int d);
}

public class Lambda {
    public static void main(String[] args)  {
        withoutParametrs wp = () -> System.out.println("Wywołanie interfejsu bez parametru: ");
        wp.without();

        threeParametrs tp = (int a, int b, int c) -> a * b * c;
        System.out.println("Wywołanie interfejsu z trzema parametrami(mnożenie): " + tp.three(10, 10 ,10));

        oneParametr op = (String a) -> System.out.println("Wywołanie interfejsu z jednym parametrem: " + a);
        op.one("to mogą być napisy słowa");

        multiInstruction mi = (int a, int b, int c, int d) -> {
            int multiI = a + b * c - b;
            multiI = multiI / 2;
            multiI *= multiI;
            return multiI;
        };
        System.out.println("Wywołanie interfejsu zwierającego wiele instrukcji: " + mi.multi(1,2,3,4));
    }
}