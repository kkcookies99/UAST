 class Solution {
    public String XXX(String s, int numRows) {
        char[] a = s.toCharArray();
        int len = a.length;

        if(numRows==1 || numRows>=len) return s; // 直接返回

        if(numRows==2) { //还没有斜线，索性单列出来了
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<len; i+=2){
                sb.append(a[i]);
            }
            for(int i=1; i<len; i+=2){
                sb.append(a[i]);
            }

            return sb.toString();
        }

        
        // numRows>2， 开始有斜线存在

        int N = numRows * 2 - 2; // 一个单位的 |/
        // 竖着numRows个, 斜着numRows-2个
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){ //每行一个StringBuilder
            sb[i] = new StringBuilder();
        }

        for(int i=0; i<len; i++){
            int rem = i% N; // 在一个|/里的位置
            if(rem<numRows){ //是否在竖线上
                sb[rem].append(a[i]);
            } else { //在斜线的哪行上
                int line = (numRows-1) - (rem % numRows +1);
                sb[line].append(a[i]);
            }
        }

        StringBuilder s_final = new StringBuilder(); //全部串起来

        for(int i=0; i<numRows; i++){
            s_final.append(sb[i].toString());
        }

        return s_final.toString();

    }
}

