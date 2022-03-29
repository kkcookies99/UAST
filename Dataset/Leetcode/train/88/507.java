 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int left = 0, right = 0;
        List<Integer> ans = new ArrayList<>();
        while(left < m && right < n) {
            if(nums1[left] < nums2[right]) ans.add(nums1[left++]);
            else ans.add(nums2[right++]);
        }
        while(left < m) ans.add(nums1[left++]);
        while(right < n) ans.add(nums2[right++]);
        //System.out.println(ans);
        for(int i = 0; i < m + n; i++) {
            nums1[i] = ans.get(i); 
        }
    }
}

