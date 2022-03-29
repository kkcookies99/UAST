 var XXX = function(strs) {
    let str = strs[0]
    for(var i= 1;i<strs.length;i++){
        while(strs[i].indexOf(str) != 0){
            str = str.substring(0, str.length - 1);
            if(str.length <=0) return "";
            continue
        }
    }
    return str
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


