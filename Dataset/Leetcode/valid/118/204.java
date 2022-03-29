 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();
        int i = 1;
        List<Integer> temp = null;
        while(i <= numRows){
            List<Integer> inner = new ArrayList<>();
            if(i == 1){
                inner.add(1);
            }else if(i == 2){
                inner.add(1);
                inner.add(1);
            }else{
                inner.add(1);
                for(int x = 1; x < i-1; x++){
                    inner.add(x, temp.get(x - 1) + temp.get(x));
                }
                inner.add(1);
            }
            outer.add(inner);
            temp = inner;
            i++;
        }       
        return  outer;
    }
}

