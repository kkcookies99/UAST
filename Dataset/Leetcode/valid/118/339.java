 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        if(numRows>0){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            lists.add(list);
            for(int i=1;i<numRows;i++){
                list=getList(list,i);
                lists.add(list);
            }
        }
        return lists;

    }
    public List<Integer> getList(List<Integer> list,int rows){
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<=rows;i++){
            int right=0,left=0;
            if(i-1>=0){
                right=list.get(i-1);
            }
            if(i<rows){
                left=list.get(i);
            }
            list1.add(right+left);
        }
        return list1;


    }
}

