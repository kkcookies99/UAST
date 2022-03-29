    public int XXX(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)){
                start=Math.max(map.get(c)+1,start);
            }
            res=Math.max(res,i-start+1);
            map.put(c,i);
        }
        return res;
    }

