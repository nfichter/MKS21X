public class Sorts {
    private static boolean debug = true;

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
	    if (debug) {
		 printArray(a);
	    }
	}
    }

    public static void selectionSort(int[] a) {
	for (int i = 0; i < a.length-1; i++) {
	    int min = i;
	    for (int j = i; j < a.length; j++) {
		if (a[j] < a[min]) {
		    min = j;
		}
	    }
	    int holder = a[i];
	    a[i] = a[min];
	    a[min] = holder;
	    if (debug) {
		printArray(a);
	    }
	}
    }

    public static void bubbleSort(int[] a) {
	int switches = 1;
	for (int i = 0; i < a.length && switches != 0; i++) {
	    switches = 0;
	    for (int j = 0; j < a.length-1-i; j++) {
		if (a[j] > a[j+1]) {
		    int holder = a[j];
		    a[j] = a[j+1];
		    a[j+1] = holder;
		    switches++;
		}
	    }
	    if (debug) {
		printArray(a);
	    }
	}
    }
	
    public static void main(String[]args) {
	int[] a = {1, 2, 9, 5, 0, 3};
	printArray(a);
	insertionSort(a);

	System.out.println();

	int[] b = {1, 2, 9, 5, 0, 3};
	printArray(b);
	selectionSort(b);

	System.out.println();

	int[] c = {1, 2, 9, 5, 0, 3};
	printArray(c);
	bubbleSort(c);
    }
}