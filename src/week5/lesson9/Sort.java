package week5.lesson9;

public class Sort {

	public static void main(String[] args) {
		int value = 400;
		int[] elements = new int[1000];
		
		for (int i = 0; i < elements.length; i++) {
			elements[i] = (int) (Math.random() * 1000);
		}
		bubblesort(elements);
		
		
	
	}

	static void bubblesort(int[] arr) {
	    for (int i = 0; i < arr.length-1; i++){
	        for (int j = i+1; j < arr.length; j++){
	            if (arr[i] > arr[j]) {
	                int t = arr[i];
	                arr[i] = arr[j];
	                arr[j] = t;
	            }
	        }
	    }
	}
	
	public static void selectionSort (int[] numbers){
	    int min, temp;
	 
	    for (int index = 0; index < numbers.length-1; index++){
	        min = index;
	        for (int scan = index+1; scan < numbers.length; scan++)
	            if (numbers[scan] < numbers[min])
	                min = scan;
	 
	        // Swap the values
	        temp = numbers[min];
	        numbers[min] = numbers[index];
	        numbers[index] = temp;
	    }
	}
}
