 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==0||strs == null) return "";
        String pre = strs[0];
        for(int i=1;i<strs.length;i++) {
            while(strs[i].indexOf(pre)!=0) pre = pre.substring(0,pre.length()-1);
        }return pre;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


