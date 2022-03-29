 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0){
            return list;
        }
        int size;
        List<Integer> temp;
        temp = new ArrayList<>();
        temp.add(1);
        list.add(temp);
        for(int i = 0;i<numRows-1;i++){
            size = list.get(i).size();
            temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0;j<size-1;j++){
                temp.add(list.get(i).get(j)+list.get(i).get(j+1));
            }
            temp.add(1);
            list.add(temp);
        }
        //System.out.println(1<0?"true":"false");
        return list;
    }
}

