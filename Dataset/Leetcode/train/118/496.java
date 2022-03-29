 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> outside=new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            List<Integer> inside=new ArrayList<Integer>();
            inside.clear();
            inside.add(0,1);
            for(int j = 0;j<i-1;j++){
                inside.add(outside.get(i-1).get(j)+outside.get(i-1).get(j+1));
            }
            if(i!=0)
            inside.add(i,1);
            outside.add(i,inside);
        }
        return outside;
    }
}

