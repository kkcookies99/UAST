 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3){
            return list;
        }
          Map<Integer,Integer> target = new HashMap<>();
          for(int i = 0; i<nums.length; i++){
              target.put(nums[i], i);
          }
          Set<List<Integer>> res = new HashSet<>();
      for(int i = 0; i<nums.length; i++){
          for(int j = i+ 1; j<nums.length; j++){
              if(target.containsKey(-(nums[i]+nums[j]))&&i!=target.get(-(nums[i]+nums[j]))&&j!=target.get(-(nums[i]+nums[j]))){
                  List<Integer> tmp = new ArrayList<>();
                  tmp = Arrays.asList(nums[i], nums[j], -(nums[i]+nums[j]));
                  Collections.sort(tmp);
                  res.add(tmp);
              }
          }
      }
           list.addAll(res);
           return list;
    }
}

