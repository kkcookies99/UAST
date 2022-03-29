 public double XXX(int[] nums1, int[] nums2) {
    List<Integer> list=new ArrayList(Arrays.asList(nums1));
    for (int j : nums2) {
        list.add(j);
    }
    int[] nums3=new int[list.size()];
    if(nums3.length > 0) {
        Arrays.sort(nums3);
        if(list.size()%2 == 0) {
          return (nums3[nums3.length/2] + nums3[nums3.length/2 -1] )/2;
        } else {
            return nums3[nums3.length/2];
        }
    } 
    return 0;
}

