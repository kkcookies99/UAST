 class Solution {
    public int XXX(String s) {
        int n=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int k=1;
            if(i<arr.length-1){
                if(arr[i]=='I'&&(arr[i+1]=='V'||arr[i+1]=='X')){
                    n-=1;
                    continue;
                }
                if(arr[i]=='X'&&(arr[i+1]=='L'||arr[i+1]=='C')){
                    n-=10;
                    continue;
                }
                if(arr[i]=='C'&&(arr[i+1]=='D'||arr[i+1]=='M')){
                    n-=100;
                    continue;
                }
            }
            switch(arr[i]){
                case 'M':k*=10;
                case 'C':k*=10;
                case 'X':k*=10;
                case 'I':n+=(1*k);break;

                case 'D':k*=10;
                case 'L':k*=10;
                case 'V':n+=(5*k);break;
            }
        }
        return n;
    }
}

