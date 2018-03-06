package syntix;

import java.util.Arrays;

/*  		Multi Dimensional Array
 * An Array Object that store other arrays.
 * */
 
public class ASample {

	public static void main(String[] args) {
		
		int []  oneD;
		long [] [] twoD;
		double [] [] [] threeD;
		
		oneD = new int[5];
		twoD = new long [5][2];
		threeD = new double [3] [2] [2];
		
		oneD[0] = 12;
		oneD[2] = 27;
		System.out.println(Arrays.toString(oneD));
		
		twoD [2][0]=100;
		twoD [4][1]=100;
		System.out.println(Arrays.deepToString(twoD));
		
		//2nd shhet 2rd row 1st colum
		threeD [1][1][0] = 1221.232154;
		System.out.println(Arrays.deepToString(threeD));
	}

}
/*
 
 */