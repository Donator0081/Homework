package lesson7.Library;

public class Library {
    String fullName;
    String numbTicket;
    String faculty;
    String birthDate;
    String numbTelephone;

    public Library(String fullName, String numbTicket, String faculty, String birthDate, String numbTelephone) {
        this.fullName = fullName;
        this.numbTicket = numbTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.numbTelephone = numbTelephone;
    }

    void takeBook(int quantity) {
        System.out.println(this.fullName + " takes " + quantity + " books");
    }

    void takeBook(String... title) {
        for (String tit : title) {
            System.out.println(this.fullName + " takes " + tit);
        }
    }

    void takeBook(BookParam... object) {
        for (BookParam ob : object) {
            System.out.println(this.fullName + " takes " + ob.name + " " + ob.author);
        }
    }

    void returnBook(int quantity) {
        System.out.println(this.fullName + " returns " + quantity + " books");
    }

    void returnBook(String... title) {
        for (String tit : title) {
            System.out.println(this.fullName + " returns " + tit);
        }
    }

    void returnBook(BookParam... object) {
        for (BookParam ob : object) {
            System.out.println(this.fullName + " returns " + ob.name + " " + ob.author);
        }
    }

    public static void main(String[] args) {
        Library[] user = new Library[3];

        user[0] = new Library("Big Bob", "AS00001", "A-1", "12.11.1991", "0956612967");
        user[1] = new Library("Small Kitty", "AS00002", "A-2", "03.02.1992", "0506741212");
        user[2] = new Library("Tomson Jerry", "AS00003", "A-3", "25.01.2003", "0551213456");

        for (Library a : user) {
            System.out.println(a.fullName + " " + a.numbTicket + " " + a.faculty + " " + a.birthDate + " " + a.numbTelephone);
        }

        System.out.println();

        user[0].takeBook(4);
        user[1].takeBook("\"Hello\"", "\"Cute\"");

        BookParam book = new BookParam("Honey", "\"Gordon Freeman\"");
        user[2].takeBook(book);

        System.out.println();

        user[0].returnBook(5);
        user[1].returnBook("\"Why\"", "\"not?\"");
        user[2].returnBook(book);
    }
}
