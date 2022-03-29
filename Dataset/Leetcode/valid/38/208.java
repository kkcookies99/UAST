class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }else{
            int[] cnt = new int[10];
            StringBuilder cur = new StringBuilder("1");
            StringBuilder nxt = new StringBuilder();
            for(int i = 1; i < n; i++){
                char pre = '0';
                for(int j = cur.length() - 1; j >= 0; j--){
                    if(cur.charAt(j) != pre){
                        if(pre != '0'){
                            nxt.insert(0, pre);
                            nxt.insert(0, cnt[pre - '0']);
                            cnt[pre - '0'] = 0;
                        }
                        pre = cur.charAt(j);
                    }
                    ++cnt[pre - '0'];
                }
                nxt.insert(0, pre);
                nxt.insert(0, cnt[pre - '0']);
                cnt[pre - '0'] = 0;

                cur.delete(0, cur.length());
                cur.append(nxt);
                nxt.delete(0, nxt.length());
            }
            return cur.toString();
        }
    }
}

