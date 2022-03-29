  public int XXX(int[] nums, int target) {

        int i = Arrays.toString(nums).indexOf(target);

        if(i != -1){

            return i;

        }else{

            int k = 0;
            int j;
            while(target > nums[k] && k < nums.length-1){
                k++;
            }
            ArrayList<Integer> arrayList = new ArrayList<>(nums.length);
            for(int x : nums){
                arrayList.add(x);
            }
            if(target> nums[nums.length-1]){
                j = k+1;
                arrayList.add(j, target);
            }else{
                j = k;
                arrayList.add(j,target);
            }
            
            return j;
        }
    }

