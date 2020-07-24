package assignment9;

//39.	Write a Program to display name in short form.
// E.g. Ram Kishore Singh  -> R. k. Singh

public class Question39 {
	
	 static void ShortFrom(String name) { // this gives initials
		 //R.K.S
		 
		 if (name.length() == 0)
			 return;
		 
		 String words[]= name.split(" ");
		 for(String word : words) {
			 System.out.print(Character.toUpperCase(word.charAt(0))+ ".");
		 }
		 System.out.println();
	 }
		 
		 public static String shortName(String name) {
			// this gives R. K. Singh
			 
			 String words[]= name.split(" ");
			 
			 //alt way
			 
			 String sName="";
			 for (int i = 0; i< words.length -1; i++) {
				 String initials;
				 if(i ==0)
					 initials = ((words[i].charAt(0))+ ". ").toUpperCase();
				 else
					 initials = ((words[i].charAt(0))+". ").toLowerCase();
				 sName += initials;
					 
			 }
			 
			 sName += words[words.length-1];
			 System.out.println(sName);
			 return sName;
			 
		 }
		
	
	
	public static void main(String[] args) {
		
		String name = "Ram Kishore Singh";
		ShortFrom(name);
		shortName(name);
		
		
		
	}

}
