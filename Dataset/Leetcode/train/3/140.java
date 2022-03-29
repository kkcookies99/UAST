 class Solution {
    public int XXX(String s) {



        //垃圾解法
        // int[] flag = new int[128];

        // int maxLength=0;
        // int secLength=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         if(flag[s.charAt(j)]==0){
        //             secLength++;
        //             flag[s.charAt(j)]=1;
        //         }else{
        //             break;
        //         }
        //     }

        //     maxLength=Math.max(maxLength,secLength);
        //     secLength=0;
        //     flag = new int[128];
        // }
        // return maxLength;

        //睾丸滑动窗口
        int[] position = new int[128];
        for(int i=0;i<128;i++){
            position[i]=-1;
        }
        int n = s.length();
        int maxLength = 0;
        int lastPosition =-1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            lastPosition = Math.max(lastPosition,position[c]);
            maxLength = Math.max(maxLength,i-lastPosition);
            position[c]=i;
        }
        return maxLength;
    }
}

