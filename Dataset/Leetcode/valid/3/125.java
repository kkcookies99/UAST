 class Solution {
    public int XXX(String s) {
        int[] n = new int[s.length()];
        char[] str = s.toCharArray();
        int max = 0;
        int count = 0;
        int index = 0;//当前开始位置
        HashMap<Character, Integer> strindex = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(strindex.containsKey(str[i])){
                n[i] = strindex.get(str[i]);
                strindex.put(str[i],i);
                index = Math.max(index,n[i]);
                count = (i - index);
                max = Math.max(max,count);
                
            }else {
                strindex.put(str[i],i);
                n[i] = -1;
                count++;
                max = Math.max(max,count);
            }
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

