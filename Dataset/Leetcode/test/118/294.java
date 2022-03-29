 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> listint = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j>=i){
                    listint.add(1);
                    continue;
                }
                listint.add(lists.get(i-1).get(j)+lists.get(i-1).get(j-1));
            }
            lists.add(listint);
        }
        return lists;
    }
}

