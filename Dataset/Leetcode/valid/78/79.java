public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> rsp = new ArrayList<>();
        if (nums == null) {
            return rsp;
        }
        rsp.add(new ArrayList<Integer>());
        for(int i: nums){
            int len=rsp.size();
            for(int j=0;j<len;j++){
                List<Integer> temp= new ArrayList<>(rsp.get(j));
                temp.add(i);
                rsp.add(temp);
            }
        }
        return rsp;
    }

