  public double XXX(int[] nums1, int[] nums2) {
         int[] nums=new int[nums1.length+nums2.length];
		 System.arraycopy(nums1, 0, nums, 0, nums1.length);
		 System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
		 Arrays.sort(nums);
		 int a=nums.length%2,b=nums.length/2;
		 double num=0;
		 if(a!=0){
			num= nums[b];
		 }else {
			 num= (nums[b]+ nums[b-1])*0.5;
		}
		 return num;
    }

