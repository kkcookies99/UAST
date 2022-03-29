 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] baoli = new int[n1+n2];
        int index = 0;
        for(int num1 : nums1){
            baoli[index++] = num1;
        }
        for(int num2 : nums2){
            baoli[index++] = num2;
        }
        Arrays.sort(baoli);
        double mid = 0;
        if(baoli.length%2==1){
            mid = (double)baoli[baoli.length/2];
        }else{
            mid = ((double)baoli[baoli.length/2]+(double)baoli[baoli.length/2-1])/2;
        }
        return mid;
    }
}

