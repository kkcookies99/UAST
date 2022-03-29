 class Solution {
    public String XXX(String[] strs) {
        String pre = "";
        if(strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        pre = help(strs[0],strs[1]);
        if(pre==null){
            return "";
        }
        for (int i = 2; i < strs.length; i++) {
            pre = help(pre,strs[i]);
            if(pre==null){
                return "";
            }
        }
        return pre;
    }
    private String help(String s1,String s2){
        int len = Math.min(s1.length(),s2.length());
        for (int i = len; i > 0; i--) {
            String t = s1.substring(0,i);
            if (t.equals(s2.substring(0,i))){
                return t;
            }
        }
        return null;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

