 var XXX = function(haystack, needle) {
    if(needle.length == 0) return 0
        for(var i = 0;i<haystack.length;i++){
            if(haystack[i] == needle[0]){
                if(haystack.substr(i,needle.length) == needle){
                    return i
                }
            }
        }
        return -1
    };

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


