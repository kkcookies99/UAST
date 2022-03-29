 public int XXX(int[] height) {
        if(height==null)return 0;
        int i=0,j=height.length-1,res=0;
        while(i<j){
            int temp=Math.min(height[i],height[j]);
             res=Math.max(res,temp*(j-i));
            if(height[i]<height[j]){
                ++i;
            }else{
                --j;
            }
        }
        return res;

    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


