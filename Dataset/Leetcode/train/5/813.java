 class Solution {
    public String XXX(String s) {
        String s1 = s;
        s = getStr(s);
        int[] arr = new int[s.length()];
        int R = -1;
        int C = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i>=R){
                arr[i] = get(s,i);
                R = Math.max(arr[i] + i - 1, R);
                C = i;
            }else {
                if (2*C - arr[2*C-i]-i+1 > 2*C-R){//在左边界里面
                    arr[i] = arr[2*C-i];
                }else if(2*C-i+1 - arr[2*C-i] < 2*C-R){//包含左边界
                    arr[i] = R - i + 1;
                }else{
                    if (R+1 < s.length() &&s.charAt(i - arr[2*C-i]) == s.charAt(R+1)){//靠边
                        int num = 0;
                        arr[i] = arr[2*C-i];
                        while (i-arr[2*C-i]-num >= 0 && s.charAt(i-arr[2*C-i]-num) == s.charAt(R+1)){//往外扩
                            arr[i]++;
                            R++;
                            if (R+1>=s.length()){
                                break;
                            }
                            num++;
                        }
                        C = i;
                    }else {
                        arr[i] = arr[2*C-i];
                    }
                }

            }

        }

        int max = -1;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
                flag = i;
            }
        }
        return s1.substring((flag-max+1)/2,(flag+max-1)/2);
    }

    public int get(String s,int i){//往外扩
        int num = 1;
        while (i-num>=0 && i+num<=s.length()-1){
            if (s.charAt(i-num) == s.charAt(i+num)){
                num++;
            }else {
                break;
            }
        }
        return num;
    }

    public String getStr(String s){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            string.append('#');
            string.append(s.charAt(i));
        }
        return string.append('#').toString();
    }
}

