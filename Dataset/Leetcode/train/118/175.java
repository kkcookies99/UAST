 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new LinkedList<>() ;
        List<Integer> initial = new ArrayList<>() ;
        initial.add(1) ;
        result.add(initial) ;
        for(int i=2;i<=numRows;i++){
            int l = 0,r = 1 ;
            List<Integer> temp = new LinkedList<>() ;
            for(int j=0;j<i;j++){
                temp.add(l+r) ;
                l = r ;
                r = getNum(j+1,result.get(i-2)) ;
            }

            result.add(temp) ;
        }

        return result ;
    }

    private int getNum(int index,List<Integer> arr){
        if(arr.size() <= index ){
            return 0 ;
        }else{
            return arr.get(index) ;
        }
    }
}

