public class PalindromeArray {
	public static void main(String[] args) {
		int remainder,i=0,temp,sum=0;  
		for(int x = 1; x < 30; x++)
		{
			temp=x;
			i=x;
			while(i>0){ 
				remainder=i%10;   
				sum=(sum*10)+remainder;    
				i=i/10;    
			}    
			if(temp==sum)    
				System.out.print(temp+",");    
			
			
			sum=0;
		}

System.out.print("are palindromes in given input range");
	}

}
