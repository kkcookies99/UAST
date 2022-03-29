var XXX = function(height) {
    var len=height.length;
    var l=0,r=len-1;
    var count=0;
    while(l<r){
        var num=Math.min(height[l],height[r]);
        count=Math.max(count,num*(r-l));    
        if(height[l]<=height[r]){
            l++;
        }else{
            r--;
        }
    }
    return count;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

