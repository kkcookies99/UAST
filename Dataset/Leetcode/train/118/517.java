 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list =new ArrayList<>();
        for(int i =1;i<=numRows;i++){
            List<Integer> list1 = new ArrayList<>();
            if(i==1){
                list1.add(1);
            }else if(i==2){
                list1.add(1);
                list1.add(1);
            }else{
                list1.add(1);
                List<Integer> list2=list.get(i-2);
                for(int j=1;j<i-1;j++){  
                    list1.add(list2.get(j-1)+list2.get(j));
                }
                list1.add(1);
            }
        list.add(list1);
        }
        return list;
}

