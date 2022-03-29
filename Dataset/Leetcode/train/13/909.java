 class Solution {
    public int XXX(String s) {
        char[] c = s.toCharArray();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int result = 0;
        for(int i = 0;i<c.length-1;i++){
            //判断后面一个的值是否小于前一个
            if(map.get(c[i+1]+"")>map.get(c[i]+"")){
                result = result-map.get(c[i]+"");
            }else{
                result = result+map.get(c[i]+"");
            }
        }
        result = result+map.get(c[c.length-1]+"");
        return result;
    }
}

