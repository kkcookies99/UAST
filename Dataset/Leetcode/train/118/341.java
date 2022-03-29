 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list =new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else{
                    List<Integer> tlist = list.get(i - 1);
                    int a = tlist.get(j-1) == null ? 0 : tlist.get(j-1);
                    int b = tlist.get(j) == null ? 0 : tlist.get(j);
                    temp.add(a+b);
                }
            }
            list.add(temp);
        }
        return list;
    }

