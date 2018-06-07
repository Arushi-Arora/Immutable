package Immutable;

public class Contacts {
    private final String fname;
    private final String number;

    public Contacts(String fname, String number) {
        this.fname = fname;
        this.number = number;
    }
    public String getFirstName(){
        return this.fname;
    }
    public String getNumber(){
        return this.number;
    }
}
