  public List<List<Integer>> XXX(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int zero = 0;
        int min = 0;
        int max = length-1;
        while (min < max){
            if (nums[min] >=0){
                zero = min;
                break;
            }else {
                min++;
            }

            if (nums[max] < 0){
                zero = max+1;
                break;
            }else if (nums[max] == 0){
                zero = max;
                break;
            }else {
                max--;
            }
        }

        for (int i = 0; i <= zero; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1; j < length-1; j++) {
                if (j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
               int third = length-1;
               while (j < third){
                   if (nums[i] + nums[j] + nums[third] == 0){
                       result.add( Arrays.asList(nums[i],nums[j],nums[third]) );
                       break;
                   }
                   third--;
               }

            }
        }
        return  result;
    }

