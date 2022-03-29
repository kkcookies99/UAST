 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> listN=new ArrayList<Integer>(); //内部集合
        List<List<Integer>> listW=new ArrayList<List<Integer>>(); //外部集合
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){ //数组中满足条件的元素加入内部集合
                        listN.add(nums[i]);
                        listN.add(nums[j]);
                        listN.add(nums[k]);
                        Collections.sort(listN); //内部集合升序排序
                        listW.add(listN); //将内部集合加入外部集合，充当其元素
                        listN=new ArrayList<Integer>(); //重新初始化内部集合，再找新的一组数
                    }
                }
            }
        }

        //对外部集合元素去除重复
        for(int i=0;i<listW.size();i++){
            for (int j=i+1;j<listW.size();j++){
                if(listW.get(i).get(0)==listW.get(j).get(0) && listW.get(i).get(1)==listW.get(j).get(1) && listW.get(i).get(2)==listW.get(j).get(2)){
                    listW.remove(j);
                }
            }
        }
        return listW;
    }
}

