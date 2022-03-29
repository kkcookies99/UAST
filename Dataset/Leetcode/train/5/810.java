 class Solution {
    public String XXX(String s) {
        boolean[] data = new boolean[s.length()];
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++)
                    data[i] = true;
        int len = 0;
        int left = 0, right = 0;
        String result = new String();
        for(int i = str.length - 2; i >= 0; i--){
            boolean bool = false;
            for(int j = i + 1; j < str.length; j++){
                boolean temp = data[j];
                if(str[i] == str[j]){
                    if(i + 1 > j - 1){
                        data[j] = true;
                    }else{
                        data[j] = bool;
                    }
                }else{
                    data[j] = false;
                }
                if(data[j]){
                    if(len < j - i + 1){
                        len = j - i + 1;
                        left = i;
                        right = j;
                    }
                }
                bool = temp;
            }
    }
            for(int k = left; k <= right; k++)
                result += str[k];
            return result;
    }
}

