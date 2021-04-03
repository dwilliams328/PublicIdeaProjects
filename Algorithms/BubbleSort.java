public class BubbleSort {
    //In bubble sort indicies move/scan array 'coupled' *(arr[j],arr[j+1])
	public static void bubbleSort(int[] ar) {
        
        // idx 'i' should only reach '2ndToLast' element.
        // Last element can't selfCouplingIndex(currentIdx,nextIdx) nextIdx outOfBound
		for(int i=0; i < ar.length - 1; i++) {
            
            //Dynamic condition to target unSorted partition of array each iteration
			for(int j=0; j < (ar.length - i - 1); j++) {
				
                //Swap if selfCouplingIndex(current>next) 
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}

	public static void print(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println("\t" + ar[i]);
		}
	}

	public static void main(String[] args) {
		int[] ar = new int[]{50,37,86,12,70,25};
		
		System.out.println("Before bubble sort: ");
		print(ar);

		bubbleSort(ar);

		System.out.println("After bubble sort: ");
		print(ar);	
		
	}
}