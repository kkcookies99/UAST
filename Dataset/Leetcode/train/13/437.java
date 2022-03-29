 class Solution {
    public int XXX(String s) {
        // int num_arr[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        // String roman_arr[]={"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='I'||c=='X'||c=='C'){
                //处理4和9的情况，只存在一种情况就是前面的数小于后面的数就是4和9
                if(i+1<s.length()&&map.get(c)<map.get(s.charAt(i+1))){
                    ans+=map.get(s.charAt(i+1))-map.get(c);
                    i++;
                    continue;
                }
            }
            //其他情况直接加上就行
            ans+=map.get(c);
        }
        return ans;
    }
}

