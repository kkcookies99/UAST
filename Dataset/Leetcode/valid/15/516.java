 class Solution {
   public List<List<Integer>> XXX(int[] nums) {
        int i,j;
        int temp;
        int left,right,middle=0;
        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<3){
            return res;
        }
        for(i=0;i< nums.length-2;i++){
            if(i-1>=0&&nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i]<=0) {
                for (j = i+1; j < nums.length - 1; j++) {
                    boolean exist = false;
                    if (list.containsKey(nums[i])) {
                        if (list.get(nums[i]) == nums[j]) {
                            exist = true;
                        }
                    }
                    if (exist != true) {
                        list.put(nums[i], nums[j]);
                        left = j + 1;
                        right = nums.length - 1;
                        temp = 0 - nums[i] - nums[j];
                        boolean find = false;
                        while (left <= right) {
                            middle = (left + right) / 2;
                            if (nums[middle] < temp) {
                                left = middle + 1;
                            } else if (nums[middle] > temp) {
                                right = middle - 1;
                            } else {
                                find = true;
                                break;
                            }
                        }
                        if (find == true) {
                            List<Integer> tmp = new ArrayList<>();
                            tmp.add(nums[i]);tmp.add(nums[j]);tmp.add(nums[middle]);
                            res.add(tmp);
                        }
                    }
                }
            }
            else if(nums[i]>0){
                break;
            }
        }
        return res;
    }
}

