public class TestBook {
    public static void main(String[] args) {
        Author teck = new Author("Tan Ah Teck", "teck@somewhere.com", 'm');
        System.out.println(teck);  // toString()

        Book dummyBook = new Book("Java for dummies", teck, 9.99, 88);
        System.out.println(dummyBook);  // toString()

        Author teck2 = new Author("Peter Lee", "peter@nowhere.com", 'm');
        Book moreDummyBook = new Book("Java for more dummies",teck2,19.99, 8);
        // anonymous instance of Author
        System.out.println(moreDummyBook);  // toString()
    }
}
