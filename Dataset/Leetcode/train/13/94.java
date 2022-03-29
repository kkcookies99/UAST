class Solution {
    public int XXX(String s) {
        Integer n = 0;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        for(int i = 0;i<s.length();i++) {
            Integer value = map.get(String.valueOf(s.charAt(i)));
            if(i< s.length()-1 && value < map.get(String.valueOf(s.charAt(i+1)))) {
                n =n-value;
            } else{
                n=n+value;
            }  
        };
        return n;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

