    class Solution {
        public String XXX(int n) {
            if(n == 1) return "1";
            String res = "",str = "1",next;
            for(int i = 0; i < n - 1; ++i){
                res = getNextString(str);
                //System.out.println(res);
                str = res;
            }
            return res;
        }
        private String getNextString(String str){
            if(str.length() == 0) return "";
            String res = "";
            int cnt = 1;
            char pre = '#';
            boolean flag = false;

            for(char c : str.toCharArray()){
                if(!flag) {
                    pre = c;
                    flag = true;
                }
                else{
                    if(c == pre) ++cnt;
                    else{
                        res += cnt;
                        res += pre;
                        cnt = 1;
                        pre = c;
                    }
                }
            }
            res += cnt;
            res += pre;
            return res;
        }
    }

