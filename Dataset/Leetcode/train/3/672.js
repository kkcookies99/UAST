 var XXX = function(s) {
    if(!s.length) return 0
    if(s.length === 1) return 1
    let strCache = [],numCache = [];
    for(let i = 0; i < s.length; i++){
        const item = s[i]
        if(!strCache.includes(item)){
            strCache.push(item)
            if(i===s.length - 1) {
                numCache.push(strCache.length)
                return Math.max(...numCache)
            }
        }else {
            numCache.push(strCache.length);
            const temp = JSON.parse(JSON.stringify(strCache))
            strCache.length = 0;
            const existIndex = temp.findIndex(v => v === item)
            if(existIndex > -1) {
               strCache = strCache.concat(temp.slice(existIndex + 1))
                strCache.push(item)
            }else {
                strCache.push(item)
            }
        }
    }    
    return  Math.max(...numCache)
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


