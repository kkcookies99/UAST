public List<List<Integer>> XXX(int[] nums) {
      List<List<Integer>> res=new ArrayList<>();
      res.add(new ArrayList<>());
      for(int num:nums){
        for(int i=0,j=res.size();i<j;i++){
          List<Integer> list=new ArrayList<>(res.get(i));
          list.add(num);res.add(list);
        }
      }
      return res;
}

