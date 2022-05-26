class Com implements Comparable<Com>{
    int number;

    public int compareTo(Com y) {
        if(number>y.number){
            return 1;
        }
        if(number==y.number) {
            return 0;
        }

        return -1;

    }

    public int getNumber() {
        return number;
    }

    public void setLiczba(int number) {
        this.number = number;
    }

    public Com(int number) {
        this.number = number;
    }
}
 class Com2{
    public static void main(String[] args) {
        Com a = new Com(50);
        Com b = new Com(50);
        Com c = new Com(20);
        Com d = new Com(100);
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(d));

    }
}