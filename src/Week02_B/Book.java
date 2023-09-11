package Week02_B;

public class Book {

    // private, public , , protected
    private String title;
    private String author;

    public void setTtile(String t1){
        title=t1;
    }

    public void setAuthor(String author1){
        author=author1;
    }
    public String getTitle(){
        return  title;
    }
    public String getAuthor(){
        return author;
    }

    public  void displayInfo(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
    }
}
