public class StringPrinter {
    private String s;

    public StringPrinter() {
        System.out.println("empty");
    }

    public StringPrinter(String s) {
        this.s = s;
        System.out.println("full");
    }

    public void print() {
        System.out.println(s);
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
