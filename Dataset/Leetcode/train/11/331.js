var XXX = function(height) {
    if(!height.length) return 0;
    let l = 0, r = height.length - 1, max = 0;
    while(l < r){
        let area = (height[l] < height[r] ? height[l] : height[r]) * (r - l);
        max = max > area ? max : area;
        if(height[l] <= height[r]){
            l++;
        }else{
            r--;
        }
    }
    return max;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

