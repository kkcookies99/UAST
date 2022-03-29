class Solution {
public:
    int XXX(int x) {
    int res;
    int max=x,mid=max/2;
    if(x==1||x==0)
        res= x;
    else
    {
        while(x/mid<=mid)
        {
            max=mid;
            mid=max/2;
        }
        for(int i=mid;i<=max;i++)
        {
            if(x/i>=i)
            {
                res=i;
            }        
        }
    }
       return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


