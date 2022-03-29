 public List<List<Integer>> XXX(int numRows) {
         List<List<Integer>> lists=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                }else{
                    int sum=lists.get(i-1).get(j-1)+lists.get(i-1).get(j);
                    list.add(sum);
                }
            }
            lists.add(list);
        }
        return lists;
    }

