 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList();
        List<Integer> a1= Arrays.asList(1);
        List<Integer> a2= Arrays.asList(1,1);
        if(numRows==1){
            res.add(a1);
        }else if(numRows==2){
            res.add(a1);
            res.add(a2);
        }else{
            res.add(a1);
            res.add(a2);
            List<Integer> front=a2;
            for(int i=3;i<=numRows;i++){
                List<Integer> temp=new ArrayList();
                for(int j=1;j<=i;j++){
                    if(j==1||j==i)
                        temp.add(1);
                    else{
                        temp.add(front.get(j-1)+front.get(j-2));
                    }
                }
                front=temp;
                res.add(temp);
            }
        }
        return res;
    }
}

