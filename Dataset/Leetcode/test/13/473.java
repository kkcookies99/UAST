 class Solution {
    public int XXX(String s) {
       int[] map = new int[26];
       map['I'-'A'] =1;
       map['V'-'A'] = 5;
       map['X'-'A'] = 10;
       map['L'-'A'] = 50;
       map['C'-'A'] = 100;
       map['D'-'A'] = 500;
       map['M'-'A'] = 1000;
       int res =0;
       char[] chars = s.toCharArray();
       for(int i=0;i<chars.length;++i){
           int index = chars[i]-'A';
           if(i+1<chars.length && map[chars[i]-'A']<map[chars[i+1]-'A']){
                res += map[chars[i+1]-'A']-map[chars[i]-'A'];
                i++;
           }else{
               res += map[index];
           }
       }  
       return res;
    }
}

