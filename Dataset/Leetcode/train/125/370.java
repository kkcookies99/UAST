 class Solution {
    public boolean XXX(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right&&!isNumOrZm(arr[left])) left++;
            while(left<right&&!isNumOrZm(arr[right])) right--;
            if(arr[left]==arr[right]||
            (Math.abs(arr[left]-arr[right])==32&&isTwoZm(arr[left],arr[right]))){
                left++;
                right--;
            }else return false;
        }
        return true;
    }

    private boolean isNumOrZm(char ch){
        if(ch>='A'&&ch<='Z') return true;
        else if(ch>='a'&&ch<='z') return true;
        else return ch>='0'&&ch<='9';
    }
    
    private boolean isTwoZm(char ch1,char ch2){
        return (ch1>='A'&&ch1<='Z'||ch1>='a'&&ch1<='z')&&
(ch2>='A'&&ch2<='Z'||ch2>='a'&&ch2<='z');
    }
}

