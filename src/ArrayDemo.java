import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr;
		int arr1[];
		
		arr =  new int[10];
		
		double[] arr2 =  new double[10];
		
		boolean[] arr3 =  new boolean[10];
		
		int[][] matrix = {{1,2,3},{4,5,6}};
		
		System.out.println(matrix[1][0]);
		
		int[] arr0 = {1,2,3};
		int[] arr9 = {1,2,3};
		
		Arrays.sort(arr2);
		
		System.out.println(arr0.equals(arr9));

	}

}
