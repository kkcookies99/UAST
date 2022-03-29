public int XXX(String s){
        int l = 0, r = -1; //子数组[l, r]，初始值为空
        int res = 0;       //返回值
        int[] freq = new int[256]; //存储子数组当前每个字符的频次
        char[] chars = s.toCharArray();
        while(l < chars.length){
            if(r < chars.length - 1 && freq[chars[r + 1]] == 0){
                freq[chars[++r]]++;
            }else{
                freq[chars[l++]]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

code block

