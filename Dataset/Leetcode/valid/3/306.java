public int XXX(String s) {
        if(s.length() <= 1)return s.length();
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int l = -1,ans = 0;
        Integer temp;
        for (int i = 0; i < chars.length; i++){
            if((temp = map.get(chars[i]))!=null){
                if(temp < l){
                ans = Math.max(ans, i - l);
                }else {
                    ans = Math.max(ans,i-temp);
                    l = temp;
                }
            }else {
                    ans = Math.max(ans, i - l);

            }
            map.put(chars[i],i);
        }
        return ans;


    }
    

