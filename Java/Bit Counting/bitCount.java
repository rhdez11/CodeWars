public class BitCounting {

	public static int countBits(int number){

	    String bin = Integer.toBinaryString(number);

	    int ans=0;
	    for(int i=0;i<bin.length();i++){  
	      if(bin.charAt(i)=='1'){
		ans++;
	      }      
	    }

	    return ans;
	}
}
