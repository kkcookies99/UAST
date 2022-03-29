class Solution {
        List<List<Integer>> ss = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        public List<List<Integer>> XXX(int[] nums) {
            backTracking(0, nums, nums.length);
            return ss;
        }
        public int [] remove(int []nums, int index){
            int [] newArray = new int [nums.length - 1];
            for(int i = 0; i < nums.length - 1; i++) {
                if(i < index)
                    newArray[i] = nums[i];
                else
                    newArray[i] = nums[i + 1];
            }
            return newArray;
        }

        public void backTracking(int start, int []nums, int len){
            if(s.size() == len){
                ss.add(new ArrayList<Integer>(s));
                return;
            }
            for(int i = start; i < nums.length; i++){
                s.add(nums[i]);
                backTracking(0, remove(nums, i), len);
                s.remove(s.size() - 1);
            }
        }
    }

