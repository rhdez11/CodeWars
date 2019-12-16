public class Maskify {
    public static String maskify(String str) {
        if(str.length()>=4){
          int lastFour=str.length()-4;
          String masked="";
            for(int i=0;i<lastFour;i++){
              masked+='#';
            }
          return masked + str.substring(lastFour); 
        }else {
          return str;
        }
    }
}
