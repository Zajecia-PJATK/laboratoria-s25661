enum silnik{
    Disel , Benzynowy;
}

abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected silnik rodzajSilnika;
}

public class Kosiarka extends Maszyna{
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika, silnik rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy){
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }
    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }
    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void wyswietl(){
        String wynik = ", czy melekser=";
        String name = "";
        if(rodzajSilnika==silnik.Disel){
            name = "Disel";
        }
        else if(rodzajSilnika==silnik.Benzynowy){
            name = "Benzynowy";
        }
        if(czyMelekser){
            wynik+="tak";
        }
        else {
            wynik += "nie";
            wynik += ", czy napęd=";
        }
        if(czyNaped){
            wynik+="tak";
        }
        else{
            wynik+="nie";
        }

        System.out.println("Kosiarka{marka=" + super.marka + ", nazwa=\'" + super.nazwa + "\', pojemność silnika=" + super.pojemnoscSilnika + ", rodzaj silnika"
                + name + wynik + ", liczba ostrzy=" + this.liczbaOstrzy + "}");
    }
}