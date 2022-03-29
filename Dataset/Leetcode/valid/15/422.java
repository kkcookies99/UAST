 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;++i){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;++i){
            for(int j=i+1;j<nums.length;++j){
                int t=-(nums[i]+nums[j]);
                if(map.containsKey(t)&&map.get(t)>j){
                    set.add(Arrays.asList(nums[i],nums[j],t));
                }
            }
        }
        return new ArrayList<>(set);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


