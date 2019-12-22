public class DigPow {
	
	public static long digPow(int num, int pow) {
		String numString = String.valueOf(num);
		
		long result = 0;
		
		for(int i =0; i<numString.length(); i++){
  	    result += Math.pow(Character.getNumericValue(numString.charAt(i)),pow);
  	    pow++;
  	}
  	
  	if(num>result || result%num!=0){
  	    return -1;
  	}else{
  	    return result/num;
  	}
	}
	
}
