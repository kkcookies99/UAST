class Solution {
    public int XXX(int x) {
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        int left=1,right=x/2;
        int ans=0;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(x/mid>=mid)
            {
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


