 class Solution {
        public static double XXX(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        ArrayList<Integer> ger = new ArrayList<>();
        int i=0, j=0;
        if((n1+n2)>1){
            while ((i+j)<=(n1+n2)/2){
                if (i >= n1) {
                    ger.add(nums2[j]);
                    j++;
                    continue;
                }
                if (j >= n2) {
                    ger.add(nums1[i]);
                    i++;
                    continue;
                }
                if (nums1[i] < nums2[j]) {
                    ger.add(nums1[i]);
                    i++;
                }else {
                    ger.add(nums2[j]);
                    j++;
                }
            }
            return (n1+n2) % 2 != 0 ? ger.get(ger.size()-1) : (ger.get(ger.size()-1) + ger.get(ger.size() - 2)) / (double) 2;
        } else return n1 == 0 ? nums2[0] : nums1[0];
    }

}

