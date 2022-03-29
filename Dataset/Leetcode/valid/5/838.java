 class Solution {
    public static String XXX(String s) {
        if(s == null || s.length() == 0) return "";
        return process(s);

    }

    public static String process(String str){
        int pmax = 0;
        int max = 0 ;
        char[] arrs = str.toCharArray();
        for(int i = 0 ;i < str.length(); i++){
            int num1 = process2(arrs,i);
            int num2 = process3(arrs,i);
            num1 = Math.max(num1,num2);
            max = Math.max(num1,max);
            if(num1 >= max){
                pmax = i;
            }
        }
        int p = pmax - (max/2);
        return str.substring(p,p+max);
    }
    
    public static int process2(char[] str, int p){
        int left = p-1;
        int right = p + 1;
        int count = 1;
        while(left >= 0 && right < str.length){
            if(str[left] == str[right]){
                count += 2;
                left --;
                right ++;
            }else{
                return count;
            }
        }
        return count;
    }

    public static int process3(char[] str, int p){
        int left = p-1;
        int right = p;
        int count = 0;
        while(left >= 0 && right < str.length){
            if(str[left] == str[right]){
                count += 2;
                left --;
                right ++;
            }else{
                return count;
            }
        }
        return count;
    }

   
}

