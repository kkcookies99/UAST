 class Solution {
    public int XXX(int[] height) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i:height){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int fin=0;
        int []temp=Arrays.copyOf(height,height.length);
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            fin=Math.max(fin,math(height,temp[i]));
        }
        return fin;
    }
    public int math(int[] height,int line){
        int left=0,right=0;
        for(int i=0;i<height.length;i++)if(height[i]>=line){
            left=i;break;
        }
        for(int i=height.length-1;i>=0;i--)if(height[i]>=line){
            right=i;break;
        }
        return line*(right-left);
    }
}

