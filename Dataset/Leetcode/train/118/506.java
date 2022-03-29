 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> arr = new ArrayList();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    arr.add(1);
                } else {
                    List<Integer> sh = list.get(i-1); 
                    int x = sh.get(j - 1);
                    int y = sh.get(j); 
                    arr.add(x + y);
                }
            }
            list.add(arr);
        }
        return list;
    }
}

