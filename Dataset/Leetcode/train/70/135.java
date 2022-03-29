 public int XXX(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        for (int i=3;i<=n;i++){
            map.put(i,map.get(i-1)+map.get(i-2));
        }
        return map.get(n);
    }