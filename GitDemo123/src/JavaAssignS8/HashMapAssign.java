package JavaAssignS8;

import java.util.*;

public class HashMapAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

  //Find the frequency of each character in a given string
    /*
     i=2,n=1,d=1,a=1
     2+1
     * */
  HashMap<Character,Integer> hMapOutPut = new HashMap<>();
  //HashMap map = new HashMap();
  String sInput = "india";
  char[] strInputArray = sInput.toCharArray();
  for(char fLoop: strInputArray) {
   System.out.println(fLoop);
   if(hMapOutPut.containsKey(fLoop)) {
    int temp=hMapOutPut.get(fLoop)+1;
   hMapOutPut.put(fLoop,temp );
   }else {
    hMapOutPut.put(fLoop, 1);
   }
  }
System.out.println(hMapOutPut);
 }

}


