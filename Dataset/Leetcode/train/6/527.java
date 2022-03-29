 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows<2)return s;
        int length=s.length();
        char[]arr=s.toCharArray();
        char[]arr1=new char[length];
        int sta=0;
        int size=numRows*2-2;
        for(int i=0;i<length;i+=size){
            arr1[sta++]=arr[i];
        }
        for(int i=1;i<=numRows-2;i++)
            for(int j=0;j<length;j+=size){
                if(j+i<length)
                    arr1[sta++]=arr[j+i];
                if(j+size-i<length)
                    arr1[sta++]=arr[j+size-i];
            }
        for(int j=0;j<length;j+=size)
            if(j+numRows-1<length)
                arr1[sta++]=arr[j+numRows-1];
        return new String(arr1);
    }
}

