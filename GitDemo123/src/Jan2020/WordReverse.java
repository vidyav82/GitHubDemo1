package Jan2020;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " I am good boy and Girl";
				
		String[] splitStr = str.trim().split("\\s+");
		
		int WordsLen=splitStr.length;
		
		for(int i=0;i<WordsLen;i++)
		{
			String split_i=splitStr[i];
			
			int Len = split_i.length();
		    
		    char[] ch=split_i.toCharArray();
		    
		    	    
		    for(int j=0;j<(Len/2);j++)
			{
				char B = ch[j];
				ch[j]=ch[Len-(j+1)];
				ch[Len-(j+1)]=B;
				
			}
		
			
			split_i=new String(ch);
			splitStr[i]=split_i;
			
		}
	
		for(int k=0;k<WordsLen;k++)
		{
		System.out.print(splitStr[k]+" ");
		}	    

	}

}
