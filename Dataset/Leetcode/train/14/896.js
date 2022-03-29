 var XXX = function(strs) {
    let num = 0
    let a = strs[0]
    strs.map((item)=>{    
        if (num > 0) {
            if(item.length === 0) {
                a = ''
            }
            for (var i = 0; i<item.length; i++) {
/*                     console.log('来：'+item?.[i])
                    console.log('了：'+strs[0]?.[i]) */

                if ((item?.[i]) !== strs[0]?.[i]) {
                    if ( a.length >= item.substr(0,i).length) {
                        console.log('一：'+item)
                        a = item.substr(0,i)
                    }
                    continue
                }
                if (i === item.length-1) {

                    if ( a.length >= item.substr(0,i+1).length) {
                        console.log("二："+item)
                        a = item.substr(0,i+1)
                    }
                }
            }
        }        

        num ++
    })
    return a
};

