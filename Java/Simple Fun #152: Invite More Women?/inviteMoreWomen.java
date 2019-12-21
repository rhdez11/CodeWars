public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        int women = 0;
        int men = 0;
        
        for(int i =0;i<l.length;i++){
          if(l[i] == 1){
            men +=  1;
          }else if(l[i] == -1){
            women +=  1;
          }
        }
        
        if(men>women){
          return true;
        }else{
          return false;
        }
    }
}
