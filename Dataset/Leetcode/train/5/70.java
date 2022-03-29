 class Solution {
    public String XXX(String s) {
        if ( s == null || s.equals("") || s.length() == 1)
        return s;
        int n = s.length(),start=0,len=1;
        boolean[][] isPalindromic = new boolean[n][n];

        for ( int i = 0; i < n; i++ )
        isPalindromic[i][i]=true;

        for ( int i = 0; i < n - 1; i++){
            if ( s.charAt(i) == s.charAt(i+1) ){
                isPalindromic[i][i+1]=true;
                start=i;
                len=2;
            }
        }

        for ( int i = n - 1; i >= 0; i--){
            for ( int j = i + 2 ; j < n; j++){
                if ( isPalindromic[i+1][j-1] && s.charAt(i) == s.charAt(j) ){
                    isPalindromic[i][j]=true;
                    if ( j - i + 1 > len ){
                        len = j - i + 1;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start,start + len);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

