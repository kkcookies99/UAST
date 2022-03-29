 class Solution {
    public List<List<Integer>> XXX(int numRows) {
         List<List<Integer>> list_taltol = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        if(numRows <= 0){
            return list_taltol;
        }else{
            //list_sub.add(1);
            list_taltol.add(list1);
            for(int i = 1 ; i<numRows;i++){
                List<Integer> list_sub = new ArrayList<>();
                list_sub.add(1);
                for(int j = 1 ;j < i ; j++){
                    list_sub.add(list_taltol.get(i-1).get(j-1) + list_taltol.get(i-1).get(j));
                }
                list_sub.add(1);
                list_taltol.add(list_sub);
                //list_sub.clear();
            }
        }
        return list_taltol;

        
    }
}

