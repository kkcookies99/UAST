 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int []result=new int[nums1.length+nums2.length];
		int index=0;
	    //1.把两个数组数合成一个数组
		for (int i = 0; i < nums1.length; i++) {
			result[index]=nums1[i];
			index++;
		}
		for (int i = 0; i < nums2.length; i++) {
			result[index]=nums2[i];
			index++;
		}
		//2.进行排序
		Arrays.sort(result);
		//3.计算出中位数
		double iszhong = iszhong(result);
		return iszhong;     
    }
    public static double iszhong(int[]nums2) {
		Arrays.sort(nums2);
		if(nums2.length%2==0) { //说明是偶数位
			int num=(nums2.length/2)-1;
			int num2=nums2.length/2;
			int indexs1 = nums2[num];
			int indexs2 = nums2[num2];
			double results = (double)(indexs1+indexs2)/2;
			return results;
		}
		 //奇数位
		int index=nums2.length/2;
		double result = nums2[index];
		return result;
	}
}

