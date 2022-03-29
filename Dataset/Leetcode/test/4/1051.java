 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list1.addAll(list2);
        int[] arr = list1.stream().mapToInt(Integer::valueOf).toArray();
        Arrays.sort(arr);
        double x;
        if(arr.length%2 == 0){
            x = (arr[arr.length/2]+arr[arr.length/2-1]);
            x /= 2;
            return x;
        }
        else
            return arr[arr.length/2];
    }
}

