 var XXX = function(s) {
    let left = 0,
        right = s.length-1;
    s = s.toLowerCase();
    while(left < right) { 
        if(isNumOrZm(s[left])) {  // 是数字或者字母
           if(isNumOrZm(s[right])) { // 是数字或者字母  
               if(s[left]!=s[right])return false;
               left++;
               right--;
           } else {
               right--;
           }
        } else {
            left++;
        }
    }
    return true;
};
var isNumOrZm = function(char) {
    if(char==" ")return false;
    else if(!isNaN(char))return true;
    else if(char>='a' && char <= 'z')return true;
    return false;
}

