 class Solution {
    public String XXX(String s) {
        if(s.length()==1) return s;
        int len = s.length();
        boolean[][] f = new boolean[len][len];
        int max=0;
        int start = 0, end = 0;
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(i==j) f[i][j]=true;
                else if(j==i+1) f[i][j]=s.charAt(i)==s.charAt(j);
                else f[i][j] = s.charAt(i)==s.charAt(j) && f[i+1][j-1];

                if(f[i][j]&& j-i+1 >= max){
                    max = j-i+1;
                    start=i;
                    end=j;
                }

            }
        }

        return s.substring(start, end+1);

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

