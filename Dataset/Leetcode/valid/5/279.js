 var XXX = function(s) {
    if (s.length <= 1) {
        return s;
    }
    
    let maxLen = 0;
    let start = 0;
    
    for (let i = 0; i < s.length - 1; i++) {
        searchPalindrome(s, i, i);
        searchPalindrome(s, i, i+1);
    }
    
    return s.substring(start, start + maxLen);
    
    function searchPalindrome(s, left, right) {
        while(left >= 0 && right < s.length && s[left] === s[right]) {
            left--;
            right++;
        }
        
        if (maxLen < (right - left - 1)) {
            maxLen = right - left - 1;
            start = left + 1;
        }
    }
};

