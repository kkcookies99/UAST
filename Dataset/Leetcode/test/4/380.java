 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        ArrayList<Integer> list =new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        if(list.size()%2==0)
            return (list.get(list.size()/2)+list.get((list.size()/2)-1))/2.0;
        else
            return list.get(list.size()/2);
    }
}

