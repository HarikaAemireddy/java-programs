 class Book
 {


int bookId;

String bookName;
	
static String publications;
	
static
	
{
		
publications="xyz";
	
}
	

public Book(int bookId, String bookName) 
{
		
super();
		
this.bookId = bookId;
		
this.bookName = bookName;
	

}
	
	
public String toString() {
		
return bookId+" "+bookName+" "+publications;
	

}


}

 class BookMain 

{

	

public static void main(String[] args) 

{
		

Book bm1 = new Book(101,"aaa");
		
Book bm2 = new Book(102,"bbb");
		
System.out.println(bm1);//bm1.toString()
		
System.out.println(bm2);//bm2.toString()
}
}



