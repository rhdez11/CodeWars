class Persist {
  static int per=0;
	public static int persistence(long number) {
	    String numString = String.valueOf(number);
	    
	    if(numString.length()>1){
	        int result = 1;
	    
    	    for(int i =0; i<numString.length(); i++){
    	        result *= Character.getNumericValue(numString.charAt(i));
    	    }
    	    
    	    System.out.println("result: " + result);
    	    
    	    per+=1;
    	    return persistence(result);
	    }else{
	        System.out.println("per: "+ per);
                int x=per;
                per=0;
	        return x;
	    }
	}
}
