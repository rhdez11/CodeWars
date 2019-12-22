public class Kata
{
  public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
    {
        if(arrayOfArrays==null){
            return 0;
        }
        
        if(arrayOfArrays.length > 0){
            
            int [] nums =  new int[arrayOfArrays.length];
            
            for(int i=0; i< arrayOfArrays.length; i++){
                if(arrayOfArrays[i]==null){
                return 0;
                }
                
                if(arrayOfArrays[i].length == 0 ){
                    return 0;
                }
                nums[i]=arrayOfArrays[i].length;
                System.out.print(nums[i]);
            }
            
            int missing = nums[0];
            for(int i=0; i<nums.length;i++){
                if(missing>nums[i]){
                    missing=nums[i];
                }
            }
            
            for(int i=0; i<nums.length;i++){
                if(nums[i]==missing){
                    missing+=1;
                    i=-1;
                }
            }
            
            System.out.print(" miss: "+ missing);
            
            System.out.println();
            return missing;
        }else{
            return 0;
        }     
    }    
}
