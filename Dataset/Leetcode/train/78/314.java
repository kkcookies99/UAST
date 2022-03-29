class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        return mm(nums, nums.length - 1);
    }
    public List<List<Integer>> mm(int[] nums,int index) {
        if(index == 0) {
            List<List<Integer>> r = new ArrayList();
            r.add(new ArrayList());
            ArrayList<Integer> a = new ArrayList();
            a.add(nums[index]);
            r.add(a);
            return r;
        }
        List<List<Integer>> m = mm(nums, index - 1);
        int size = m.size();
        for(int i = 0; i < size; i++) {
            ArrayList<Integer> t = new ArrayList(m.get(i));
            t.add(nums[index]);
            m.add(t);
        }
        return m;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


