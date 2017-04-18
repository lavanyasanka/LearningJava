
public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {99, 76, 47, 85, 9};
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:" );

        boolean find=false;
        boolean flag=true;

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");

        //while(flag)
        //{
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] > largest) 
                {
                    find=true;
                    secondLargest = largest;
                    largest = arr[i];
                } 
                else if (arr[i] > secondLargest) 
                {
                    find=true;
                    secondLargest = arr[i];
                }
            }
            if(find)
            {
                System.out.println("\nSecond largest number is:" + secondLargest);
                flag=false;
            }else
            {
                largest = arr[1];
                secondLargest = arr[1];     
            }
      //  }
	}

}
