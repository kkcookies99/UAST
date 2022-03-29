 public List<String> XXX(int n) {
    if(n <= 0){
        return ans;
    }

    char[] chs = new char[2*n];
    int index = 0;
    int cnt = 0;          
    solve(chs, index, n, cnt);  
    return ans;
}

public void solve(char[] chs, int index, int n, int cnt) {
    if(index == chs.length){
        ans.add(String.valueOf(chs));
        return;
    }

    if(n>0){                      
        chs[index] = '(';
        solve(chs, index+1, n-1, cnt+1);
    } 

    if(cnt > 0){              
        chs[index] = ')';
        solve(chs, index+1, n, cnt-1);
    }
    
    
}

