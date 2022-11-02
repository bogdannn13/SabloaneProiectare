import java.util.*;
import java.util.Arrays;

public class mybook{
    String titlu;
    List<String> text = new ArrayList<String>();
    List<String> image = new ArrayList<String>();
    List<String> table = new ArrayList<String>();
  
	
	public mybook (String titlu) {
	    this.titlu = titlu;
	}
	
	public void createNewParagraph(String newParagraph){
	    text.add(newParagraph);
	}

	public void createNewImage(String newImage){
	    image.add(newImage);
	}

	public void createNewTable(String newTable){
	    table.add(newTable);
	}
	
	public static void main(String[] args) {
		mybook discoTitanic = new mybook("Disco Titanic");
		discoTitanic.createNewParagraph("Paragraph 1");
		discoTitanic.createNewParagraph("Paragraph 2");
		discoTitanic.createNewParagraph("Paragraph 3");
		discoTitanic.createNewImage("Image 1");
		discoTitanic.createNewParagraph("Paragraph 4");
		discoTitanic.createNewTable("Table 1");
		discoTitanic.createNewParagraph("Paragraph 5");

	discoTitanic.print();
	}

	public void print(){
	    System.out.println(titlu);
	    System.out.println(" ");
	    System.out.println(text);
	    System.out.println(" ");
	    System.out.println(image);
	    System.out.println(" ");
	    System.out.println(table);
	    System.out.println(" ");
	} 	

}


