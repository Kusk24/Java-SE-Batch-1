public class Book {
    private String title;
    private String subtitle;
    private static int BookCount;
    public Book(String title){
        this.title = title;
        BookCount++;
    }

    public Book(String title, String subtitle){
        this.title = title;
        this.subtitle = subtitle;
        BookCount++;
    }

    public static int getBookCount(){
        return BookCount;
    }

    public void display(){
        System.out.println("Title :"+ this.title);
        if (this.subtitle != null){
            System.out.println("Subtitle :"+ this.subtitle);
        }
    }

}
