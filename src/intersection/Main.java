package intersection;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		System.out.println("Nums1: " + Arrays.toString(nums1));
		System.out.println("Nums2: " + Arrays.toString(nums2));
		
		FindIntersectionOfBothArraysFunction solution = new FindIntersectionOfBothArraysFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.intersection(nums1, nums2)));
	}
}
