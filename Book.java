

class Book{

  public String title;
  public String author;
  public boolean isBorrowed;

  public Book(String title, String author){
    this.title = title;
    this.author = author;
}
    public void borrowBook(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }

    public boolean isAvailable(){
        return !isBorrowed;
    }

    public void displayInfo(){
        System.out.println("The title of the book: " + title + " by " + author + (isAvailable() ? "[Avaiable]" : "[Borrowed]"));

    }

    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
        
    
}