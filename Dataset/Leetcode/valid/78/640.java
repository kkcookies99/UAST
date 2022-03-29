 public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        int max = (int)Math.pow(2, len);
        ArrayList<List<Integer>> allSublist = new ArrayList();
        for(int i = 0; i < max; i++){
            allSublist.add(getSublist(nums, i));
        }
        
        return allSublist;
    }
    
    private List<Integer> getSublist(int[] nums, int count){
        List<Integer> list = new ArrayList();
           
        for(int index = nums.length - 1; count > 0 && index >= 0; index--){
            if((count & 1) > 0)
                list.add(nums[index]);
            
            count >>= 1;
        }
        
        return list;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


