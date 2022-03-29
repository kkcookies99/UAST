 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        class ThreeNum{
            List<Integer> list;
            ThreeNum(int a,int b,int c){
                list=new ArrayList<>(3);
                if (a>=b&&a>=c){
                    if (b>=c){
                        list.add(a);list.add(b);list.add(c);
                    }else {
                        list.add(a);list.add(c);list.add(b);
                    }
                }else if (b>=a&&b>=c){
                    if (a>=c){
                        list.add(b);list.add(a);list.add(c);
                    }else {
                        list.add(b);list.add(c);list.add(a);
                    }
                }else {
                    if (a>=b){
                        list.add(c);list.add(a);list.add(b);
                    }else {
                        list.add(c);list.add(b);list.add(a);
                    }
                }
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ThreeNum threeNum = (ThreeNum) o;
                for (int i=0;i<3;i++){
                    if (!this.list.get(i).equals(threeNum.list.get(i)))
                        return false;
                }
                return true;
            }
            @Override
            public int hashCode() {
                return Objects.hash(list);
            }
        }
        int i,j,zeroN=0;
        Boolean value;
        Map<Integer,Boolean> map=new HashMap<>(nums.length);
        Set<ThreeNum> set=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        for (i=0;i<nums.length;i++){
            if (nums[i]==0)
                zeroN++;
            value=map.get(nums[i]);
            if (value==null)
                map.put(nums[i],false);
            else if (!value){
                map.put(nums[i],true);
            }else 
                continue;
        }
        if (zeroN>2){
            set.add(new ThreeNum(0,0,0));
            map.put(0,false);
        }else if (zeroN>0){
            map.put(0,false);
        }else ;
        for (i=0;i<nums.length-2;i++){
            for (j=i+1;j<nums.length;j++){
                zeroN=0-nums[i]-nums[j];
                value=map.get(zeroN);
                if (value==null)
                    continue;
                else if (zeroN==nums[i]||zeroN==nums[j]){
                    if (value)
                        set.add(new ThreeNum(nums[i],nums[j],zeroN));
                }else {
                    set.add(new ThreeNum(nums[i],nums[j],zeroN));
                }
            }
        }
        for (ThreeNum t:
             set) {
            list.add(t.list);
        }
        return list;
    }
}

