class Solution {
    public int XXX(String s) {
    int n = s.length();
    if(n == 0) return 0;
    int sum = 0;
    for(int i =n-1;i>=0;i--){
    if(s.charAt(i) != ' '){
        sum++;
    }else if(sum != 0){
        return sum;
    }
    }
    return sum;
    }
}

