package DSA;

public class SingleDimesionalArray {
	int[] arr;

	// creation of single dimensional array
	public SingleDimesionalArray(int size) {
		arr = new int[size];
	}

	// Insertion of Single Dimensional Array
	public void sdaInsertion(int location, int values) {
		try {
			if (arr[location] == 0) {
				arr[location] = values;
				System.out.println("the values " + values + " is inserted");
			} else {
				System.out.println("The cell is already fixed");
			}
		} catch (Exception e) {
			System.out.println("There is no location to insert values ");
		}
	}

//Single Dimensional Array Traversal
	public void sdaTraversal() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// Single Dimensional Array Searching
	public int sdaSearch(int values) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == values) {
				System.out.println("The values " + values + " present in the index of " + i);
				return 0;
			}
		}
		System.out.println("The value is not present");
		return 1;
	}

	// Single Dimensional Array Deletion
	public void sdaDeletion(int location) {
		try {
			arr[location]=0;
			System.out.println("The value id Deleted");
		} catch (Exception e) {
			System.out.println("Invalid location");
		}
	}

}