class Solution {
    public static String whoLikesIt(String... names) {
        int num= names.length;
        
        String finalStr = "";
        
        if(num<=0){
            finalStr=  "no one likes this";
        }else if(num>=4){
            finalStr= names[0]+", "+names[1]+" and "+(num-2)+" others like this";
        }        
        switch(num){
            case 1:
                finalStr= names[0]+" likes this";
                break;
            case 2:
                finalStr= names[0]+" and "+names[1]+" like this";
                break;
            case 3:
                finalStr= names[0]+", "+names[1]+" and "+names[2]+" like this";
                break;
        }        
        return finalStr;
    }
}
