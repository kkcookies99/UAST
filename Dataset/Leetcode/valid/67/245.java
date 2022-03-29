 class Solution {
    public String XXX(String a, String b) {
        //a为长，b为短
        if(a.length()<b.length()){
            String k = b;
            b = a;
            a = k;
        }
        int a_length = a.length();
        int b_length = b.length();
        int a_size = a_length - 1;
        int b_size = b_length - 1;
        StringBuffer sb = new StringBuffer();
        int k = 0;
        int cur = 0;
        while(true){
            //两个字符串都遍历完了
            if(a_size == -1 && b_size == -1){
                if(k>0){
                    sb.append(k);
                }
                break;
            }
            //b遍历完了,a没有遍历完
            if(b_size == -1 && a_size!= -1){
                cur = a.charAt(a_size) - '0' + k;
                if(cur==2){
                    k = 1;
                    cur = 0;
                }else if(cur==3){
                    k = 1;
                    cur = 1;
                }else{
                    k = 0;
                }
                sb.append(cur);
                a_size--;
                continue;
            }
            cur = a.charAt(a_size) - '0'+b.charAt(b_size) - '0' +k;
            if(cur==2){
                k = 1;
                cur = 0;
            }else if(cur==3){
                k = 1;
                cur = 1;
            }else{
                k = 0;
            }
            sb.append(cur);
            a_size--;
            b_size--;
        }
        sb.reverse();
        return sb.toString();
    }
}

