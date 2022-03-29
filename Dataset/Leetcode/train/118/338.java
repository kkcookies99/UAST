 class Solution {
    public List<List<Integer>> XXX(int numRows) {
         List<List<Integer>>  list=new ArrayList<>();
        if(numRows<1)return list;
        List<Integer> listInt1=new ArrayList<>();
        listInt1.add(1);
        list.add(listInt1);
        if(numRows==1)return list;
        List<Integer> listInt2=new ArrayList<>();
        listInt2.add(1);
        listInt2.add(1);
        list.add(listInt2);
        if(numRows==2)return list;
        for(int i=2;i<numRows;i++){
            List<Integer> listInt3=new ArrayList<>();
            for(int j=0;j<=list.get(i-1).size();j++){
                if(j==0){
                    listInt3.add(1);
                }else if(j==list.get(i-1).size()){
                    listInt3.add(1);
                }else{
                    listInt3.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
            list.add(listInt3);
        }
        return list;
    }
}

