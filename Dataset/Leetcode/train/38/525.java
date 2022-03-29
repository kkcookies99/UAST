 class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }    
        String value = XXX(n-1);
        value = calulate(value);
        return value;
    }
    public String calulate(String value){
        char []a = value.toCharArray();
        String b = "";
        int count  = 1;
        if(a.length==1){
            return "11";
        }
        for(int i=0; i<a.length;i++){
            while(i<a.length-1 && a[i]==a[i+1]){
                count++;
                i++;
            }
            
            b = b+count+a[i];
            count=1;
            
        }
        return b;
    }
}

