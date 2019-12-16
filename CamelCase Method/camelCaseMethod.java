public class Solution {

    public static String camelCase(String string) {        
        if(string==""){
          return string;
        } 
        
        StringBuilder str = new StringBuilder(string);
		
    		str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
    		int l= 0;
    		
    		for (int i=0; i<str.length();i++){
    		    if(str.charAt(i)==' '){
    		        l=str.length()-1;
    		        str.deleteCharAt(i);
    		        if(i!= l){
    		            str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        		        if(str.charAt(i)==' '){
        		            i--;
        		        }
    		        }
    		    }
    		} 
        return str.toString();
    }
}
