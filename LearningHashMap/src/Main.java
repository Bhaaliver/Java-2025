public class Main{
    public static void main(String[] args) {
        ContactBook myContactBook = new ContactBook();
        ContactBook yourContactBook = new ContactBook();
        myContactBook.addNumber( "(323)323-9583");
        myContactBook.addNumber( "(329)193-9482");
        myContactBook.addNumber("Bob", "(123)456-7891");
        myContactBook.addNumber("Ben", "(938)473-8294");
        myContactBook.share("Bob", yourContactBook);
        myContactBook.share("bob", yourContactBook);
        System.out.println(myContactBook.getUsers());
        System.out.println(myContactBook.getNumber("Bob"));
        System.out.println(yourContactBook.getNumber("Bob"));
    }
}