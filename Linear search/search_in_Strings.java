import java.util.*; 

public class search_in_Strings {
	public static void main(String[] args) {
		String name = "arman" ;
		char target = 'n';
		System.out.println(search(name,target));
        System.out.printn(Arrays.toString(name.toCharArray()));
		
	}
	
	static boolean search(String str, char target) {
	    if (str.length() == 0){ // arr.length not have bracket coz it was variable and now in strings it is function
	        return false;
	    }
	   for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
            return true;
        }
        
        //.toCharArray() for for each 
  // for each on string       // for (char ch : str.toCharArray()) {
                             // if (ch == target){
                            // return true; } }  
    }
	    return false;
	}
}
