 class Solution {
    public String XXX(int num) {
        StringBuilder ret = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(109, "CM");
        map.put(105, "D");
        map.put(104, "CD");
        map.put(101, "C");
        map.put(19, "XC");
        map.put(15, "L");
        map.put(14, "XL");
        map.put(11, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        while(num-1000>=0){
            num-=1000;
            ret.append('M');
        }
        StringBuilder res = judRestRoman(num, 100, ret, map);
        return res.toString();
    }
    private StringBuilder judRestRoman(int num, int key, StringBuilder arr, Map<Integer, String> map){
        if(num == 0) return arr;
        while(num / key < 1){
            return judRestRoman(num, key/10, arr, map);
        }
        int n = num/key;
        if(key==1){
            key=0;
        }
        if(n==9){
            char[] t = map.get(key+9).toCharArray();
            for(char c:t){
                arr.append(c);
            }
        }
        else if(n>=5){
            char[] t = map.get(key+5).toCharArray();
            for(char c:t){
                arr.append(c);
            }
            char[] tr = map.get(key+1).toCharArray();
            char c = tr[0];
            arr.append(String.valueOf(c).repeat(n - 5));
        }
        else if(n==4){
            char[] t = map.get(key+4).toCharArray();
            for(char c:t){
                arr.append(c);
            }
        }
        else if(n>0){
            char[] tr = map.get(key+1).toCharArray();
            char c = tr[0];
            arr.append(String.valueOf(c).repeat(n));
        }
        return key==0?arr:judRestRoman(num%key, key/10, arr, map);
    }
}

