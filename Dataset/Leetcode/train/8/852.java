 class Solution {
    public int XXX(String str) {
        char[] Number = str.toCharArray();
        if(Number.length == 0) return 0;
        List<Character> afterTran = new ArrayList<>();
        int first = 0;
        for(int i=0;i<Number.length;i++){
            if(Number[i] != ' '){
                first = i;
                if(!((Number[i]>='0'&&Number[i]<='9')||Number[i]=='-'||Number[i]=='+'))
                    return 0;
                break;
            }
        }
        boolean flag = false;
        if(Number[first]=='-'||Number[first]=='+'){
            afterTran.add(Number[first]);
            flag = true;
        }
        if(flag){
            first++;
            while(first<Number.length && Number[first] == '0') first++;
        }else{
            while(first<Number.length && Number[first] == '0') first++;
        }
        for(int j=first;j<Number.length;j++){
            if((Number[j]>='0'&&Number[j]<='9')){
                afterTran.add(Number[j]);
            }else{
                break;
            }
        }
        if(afterTran.size() == 0) return 0;
        if(afterTran.get(0).charValue() == '+'){
            int len = afterTran.size() - 1;
            if(len>10) return Integer.MAX_VALUE;
            long ans = 0;
            int jinwei = 10;
            for(int i=len;i>=1;i--){
                ans += (afterTran.get(i) - '0')*Math.pow(10,len-i);
            }
            if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int)ans;
        }
        if(afterTran.get(0).charValue()>='0'&&afterTran.get(0).charValue()<='9'){
            int len = afterTran.size();
            if(len > 10) return Integer.MAX_VALUE;
            long ans = 0;
            int jinwei = 10;
            for(int i=len-1;i>=0;i--){
                ans += (afterTran.get(i) - '0')*Math.pow(10,len-i-1);
            }
            if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int)ans;
        }
        if(afterTran.get(0).charValue() == '-'){
            int len = afterTran.size() - 1;
            if(len>10) return Integer.MIN_VALUE;
            long ans = 0;
            int jinwei = 10;
            for(int i=len;i>=1;i--){
                ans += (afterTran.get(i) - '0')*Math.pow(10,len-i);
            }
            if(-ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return -(int)ans;
        }
        return 0;
    }
}

