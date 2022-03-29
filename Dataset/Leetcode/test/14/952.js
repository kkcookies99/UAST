 var XXX = function(strs) {
    if(strs.length===0) {
        return ""
    } else if (strs.length===1) {
        return strs[0];
    } else {
        let rstr = "";
        for(let i=0; i<strs[0].length; i++) {
            let flag = true;
            let s = strs[0].substring(0,i+1);
            for(let d=1; d<strs.length;d++) {
                if(strs[d].indexOf(s)!==0) {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                return rstr
            }else {
                rstr = s
            }
        }
        return rstr
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


