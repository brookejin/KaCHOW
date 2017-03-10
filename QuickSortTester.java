//Team KaCHOW! -- Brooke Jin, Shiva Vummidi, Brandon Zhang
//APCS2 pd5
//Lab01 -- What Does the Data Say?
//2017-03-10

/*
  Algorithm: QuickSortTester creates 2D arrays with a constant 1000 rows and varying column length
  to test the speed of an array 1000 times. 
  It divides the time result by 1000 to find the average time according to the size of the array.  
 */

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

	long startTime = System.nanoTime();
	//System.out.println(startTime);

	//sort every array
	for (int[] arr : tester) {
	    QuickSort.qsort(arr);
	}

	long endTime = System.nanoTime();
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
	System.out.println(tester(1) + " ns");
	System.out.println(tester(10) + " ns");
	System.out.println(tester(100) + " ns");
	System.out.println(tester(1000) + " ns");
	System.out.println(tester(10000) + " ns");
	System.out.println(tester(100000) + " ns");
	System.out.println(tester(1000000) + " ns");
	System.out.println(tester(10000000) + " ns");
    }//end main

}
