public int XXX(int n) {
        if(2 == n|| 3 == n){
            return n;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        for (int i = 4; i <= n ; i++) {
            map.put(i,map.get(i-1) + map.get(i-2));
        }
        return map.get(n);
    }

