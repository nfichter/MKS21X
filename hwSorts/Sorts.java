public class Sorts {
    public static void printArray(int[] a) {
	System.out.print("{");
	for (int i = 0; i < a.length; i++) {
	    if (i == a.length-1) {
		System.out.print(a[i]);
	    }
	    else {
		System.out.print(a[i] + ", ");
	    }
	}
	System.out.println("}");
    }
	
    public static void insertionSort(int[] a) {
	for (int i = 1; i < a.length; i++) {
	    int holder = a[i];
	    int j;
	    for (j = i-1; j > -1 && holder < a[j]; j--) {
		a[j+1] = a[j];
	    }
	    a[j+1] = holder;
	}
    }
	
    public static void main(String[]args) {
	int[] a = {8, 6, 7, 5, 3, 0, 9};
	printArray(a);
	insertionSort(a);
	printArray(a);
    }
}