import java.util.*;

public class BookRecords {
    private static BookRecords instance;

    public BookRecords(){}
    private Map<Integer, String> bookmap = new HashMap<Integer, String>();

    public static BookRecords getInstance() {
        if(instance == null){
            instance = new BookRecords();
        }
        return instance;
    }

    public void AddBook(String bookName){
        int bookID=1;
        if(bookmap.size() == 0){
            bookmap.put(1,bookName);
            System.out.println("Added "+bookName+" in Book Number: "+bookID);
        }
        else {
            //gets the size+1 of the Map, to check and input missing increment.
            for (int i = 1; i <= bookmap.size() + 1; i++) {
                if (bookmap.get(i) == null) {
                    bookID = i;
                    System.out.println("Added "+bookName+" in Book Number: "+bookID);
                }
            }
            bookmap.put(bookID, bookName);
        }

    }

    public void ViewBook(){
        for(Map.Entry<Integer,String> e: bookmap.entrySet()){
            System.out.println("Book Name: "+e.getValue()+", Number: "+e.getKey() );

        }
    }

    public void RemoveBook(int key){
        if(bookmap.get(key) != null){
            System.out.println("The book "+bookmap.get(key)+" is removed");
            bookmap.remove(key);
        }
    }


}
