package oops2;

public class Books {
    private long bookID;
    private String title;
    private  String author;
    private boolean isAvailable;

    public Books(long bookID,String title,String author,boolean isAvailable){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public long getBookID(){
        return bookID;
    }
    public void setBookID(long bookID){
        this.bookID =bookID;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setBookAvailable(boolean bookAvailable){
        this.isAvailable = bookAvailable;
    }

    public void displayBook(){
        System.out.println("BookId: "+ bookID);
        System.out.println("Title: "+title);
        System.out.println("Author: "+ author);
        System.out.println("Available: "+(isAvailable ? "Yes" : "No"));
    }


}
   class library{

    private Books[] books;
    private int bookcount;
       private int bookCount;

       public library() {
        this.books = new Books[5];
        this.bookcount = 0;
    }
        public void addBook (Books book){
            if (bookcount < books.length) {
                books[bookcount] = book;
                bookcount++;
                System.out.println("Book added  Successfully!");
            } else {
                System.out.println("Library is full! Cannot add more books.");
            }

        }
        public void replaceBook( long bookID,String newtitle,String newauthor){
            for (int i = 0; i <bookcount; i++) {
                if (books[i].getBookID() == bookID) {
                    books[i].setTitle(newtitle);
                    books[i].setAuthor(newauthor);
                    System.out.println("Book details updated successfully!");
                    return;
                }
            }
            System.out.println("Book ID not found"+ bookID + "not found.");
        }
       public Books searchBook(int bookID) {
           for (int i = 0; i < bookCount; i++) {
               if (books[i].getBookID() == bookID) {
                   return books[i];
               }
           }
           return null;
       }
        public void displayBook(){
        if (bookcount ==0){
            System.out.println("No books available in the library.");
        } else {
            System.out.println(" Library Books:");
            for (int i = 0; i <bookcount ; i++) {
                books[i].displayBook();

            }
        }
        }


   }






