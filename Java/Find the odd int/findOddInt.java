public class FindOdd {
	public static int findIt(int[] array) {
  int odd = 0;
  	for(int i=0;i<array.length;i++){
    int counter = 0;
    int number = array[i];
      for(int j=0; j<array.length;j++){
        if(array[i] == array[j]){
          counter += 1;
        }
      }
      if(counter%2 == 1){
        odd = number;
      }
    }
    return odd;
  }
}
