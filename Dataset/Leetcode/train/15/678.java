 class Solution {
      public List<List<Integer>> XXX(int[] nums) {
      List<List<Integer>> resp = new ArrayList<>();
      Arrays.sort(nums);
      for(int k=0;k<nums.length;k++){
          if(nums[k] > 0) break;
          if(k > 0 && nums[k] == nums[k - 1]) continue;
          int i = k+1;
          int j = nums.length-1;
          while(i<j){
              List<Integer> ans = new ArrayList<>();
              if(nums[k]+nums[i]+nums[j] == 0){
                 ans.add(nums[k]);
                 ans.add(nums[i]);
                 ans.add(nums[j]);
                 ans = ans.stream().sorted(Integer::compareTo).collect(Collectors.toList());
                 if(!resp.contains(ans)){
                     resp.add(ans);   
                 }
                 i++;
                 j--;
                 continue;
              }
              if(nums[i]+nums[j] > -nums[k]){
                  j--;
              }
              if(nums[i]+nums[j] < -nums[k]){
                  i++;
              }
          }
      }
      return resp;
    }
}

