 var XXX = function(height) {
   let max = 0, start = 0, end = height.length - 1;
    while (start < end) {
        max = Math.max(max, (end - start) * Math.min(height[start], height[end]));
        if(height[start] <= height[end]) {
            start++
        } else {
            end--
        }
    }
    return max
 };

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


