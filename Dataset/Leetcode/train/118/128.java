 public List<List<Integer>> XXX(int numRows) {
    List<List<Integer>> list = new ArrayList();
    for(int a = 0; a < numRows; a++){
        List<Integer> list2 = new ArrayList();
        for(int b = 0; b <= a; b++){
            if(b == 0 || b == a)
                list2.add(1);
            else
                list2.add(list.get(a-1).get(b)+ list.get(a-1).get(b-1));    
            }
        list.add(list2);
    }
    return list;
}

