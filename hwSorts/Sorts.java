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
	
    public static void insertion(int[] a) {
	for (int i = 1; i < a.length; i++) {
	    int holder = a[i];
	    int j;
	    for (j = i-1; j > -1 && holder < a[j]; j--) {
		a[j+1] = a[j];
	    }
	    a[j+1] = holder;
	}
    }

    public static void selection(int[] a) {
	for (int i = 0; i < a.length; i++) {
	    int min = i;
	    for (int j = i; j < a.length; j++) {
		if (a[j] < a[min]) {
		    min = j;
		}
	    }
	    int holder = a[i];
	    a[i] = a[min];
	    a[min] = holder;
	}
    }
	
    public static void main(String[]args) {
	int[] a = {8, 6, 7, 5, 3, 0, 9};
	printArray(a);
	insertion(a);
	printArray(a);

	int[] b = {8, 6, 7, 5, 3, 0, 9};
	printArray(b);
	selection(b);
	printArray(b);
    }
}