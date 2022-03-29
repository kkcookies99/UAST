 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> listall = new ArrayList<>();
        listall.add(new ArrayList<>());
        List<Integer> linshi = new ArrayList<>();
        for (int m = 1;m<=nums.length;m++) {
            fun(m, nums, 0, listall, linshi);
        }
        return listall;
    }
    public static void fun(int k,int tmp[],int i,List<List<Integer>> listall,List<Integer> linshi) {
        if (k <= 0){
            listall.add(linshi);
            return;
        }
        if (i >= tmp.length){
            return;
        }
        for (int j = i;j < tmp.length;j++){
            List<Integer> linshi1 = new ArrayList<>(linshi);
            linshi1.add(tmp[j]);
            fun (--k,tmp,++i,listall,linshi1);
            k++;
        }
    }
}

