 class Solution {
    public int XXX(String s) { //字符串要转换成数组
        char[] arr = s.toCharArray();
	int i =0;
    int j = 0;
    int max = 0;
        while(j <= arr.length-1){
            for(int x = i; x < j ;x++){
                if(arr[x] == arr[j]){
                    i = x + 1;
                }
            }
            j++;
            if(max < j-i+1){ 
            max = j-i;
                }
        }
        return max;
    }
}

