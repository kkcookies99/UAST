 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int num1 : nums1){
            list.add(num1);
        }
        for(int num2 : nums2){
            list.add(num2);
        }
        Collections.sort(list);
        int l = 0;
        int r = list.size() - 1;
        int m = l +(r - l) / 2;
        double res = 0.0f;
        if(r % 2 == 0){
            res = (double)list.get(m);
        }else{
            res = (double) (list.get(m) + list.get(m + 1)) / 2;
        }
        return res;
    }
}

