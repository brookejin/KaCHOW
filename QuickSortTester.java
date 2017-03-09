//Team KaCHOW!

public class QuickSortTester {

    //tester method for testing runTime of array of length n
    public static double tester(int n) {

	//create 2D array for testing of length 1000 x n
	int[][] tester = new int[1000][n];
	for (int i = 0; i < tester.length; i++) {
	    for (int j = 0; j < tester[i].length; j++) {
		tester[i][j] = (int) (Math.random() * 1000);
	    }
	}

	//get start time
	long startTime = System.currentTimeMillis();
	//System.out.println(startTime);

	//sort every array
	for (int[] arr : tester) {
	    QuickSort.sort(arr);
	}

	//get end time
	long endTime = System.currentTimeMillis();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)(endTime - startTime) / 1000.0;
    }

    /******************************
     * execution time analysis: 
     * Runs the tester function which
     * generates 1000 arrays of the desired
     * length n. Averages the runtime of each array
     * of length n at the end and returns the average.
     ******************************/
    public static void main( String[] args ) 
    {
	System.out.println(tester(1));
	System.out.println(tester(10));
	System.out.println(tester(100));
	System.out.println(tester(1000));
	System.out.println(tester(10000));
	System.out.println(tester(100000));
    }//end main

}
