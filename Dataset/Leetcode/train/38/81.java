class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }
        String s = XXX(n-1);
        String[] arr = s.split("");
        String res = "";
        int i = 0;
        int j = 1;
        while(j<arr.length){
            while(j<arr.length && arr[i].equals(arr[j])){
                j++;   
            }
            res+=""+(j-i)+arr[i];
            i = j;
            j = i + 1;
        }
        if(i==arr.length-1){
            res+="1"+arr[i];
        }
        return res;
    }
}

