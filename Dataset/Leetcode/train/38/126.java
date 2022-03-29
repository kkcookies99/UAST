class Solution {
    public String XXX(int n) {
        StringBuilder s = new StringBuilder("1");
        for(int i=1;i<n;i++){
            StringBuilder sb = new StringBuilder();
            int count=0;
            char pre = s.charAt(0);
            for(int j=0;j<s.length();j++){
                if(pre==s.charAt(j)) {
                    count++;
                }else{
                    sb.append(count).append(pre);
                    count=1;
                    pre=s.charAt(j);
                }
                if(j==s.length()-1)
                        sb.append(count).append(pre);
            }
            s = sb;
        }
        return s.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


