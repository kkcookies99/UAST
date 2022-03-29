 class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> l = new ArrayList();
        for(int i:nums){
            if (l.contains(i)){
                int i1 = l.indexOf(i);
                l.remove(i1);
                continue;
            }
            l.add(i);
        }
        return l.get(0);
    }
}

