package services;

public class TestMain {
	
	public static String cleanTextContent(String text)
    {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", "");
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");
         
        // removes non-printable characters from Unicode
        text = text.replaceAll("\\p{C}", "");
 
        return text.trim();
    }
	
	public static void main(String[] args) {
		System.out.println(cleanTextContent("1:"+"\r"));
		System.out.println(cleanTextContent("2:"+"\f"));
		System.out.print("3:"+"\b\b");
	}

}
