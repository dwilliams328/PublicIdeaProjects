public class SelectionSort {

	public static void sort(int[] ar) {

		for(int i=0; i < ar.length-1; i++) {  // select index

			// Write logic to compare ar[i] with element from ar[i+1] to end of array

			for(int j=i+1; j < ar.length; j++) {
                
                //If Next element <,then do a SIMPLE swap
				if(ar[j]<ar[i]) {
					int replaced_temp = ar[i];
					//Assign lesser value to outer loop index
					ar[i] = ar[j];
					//insert popped element
					ar[j] = replaced_temp;
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
		
		System.out.println("Before selection sort : ");
		print(ar);

		sort(ar);

		System.out.println("After selection sort : ");
		print(ar);
		
	}
}