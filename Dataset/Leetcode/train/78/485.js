 var XXX = function(nums) {
    let ws = [[]];
    for(let i=0; i < nums.length; ++i) {
        for(let j=0, len = ws.length; j < len; ++j) { //这里不能写成i<wx.length,因为wx是动态的,在这里把len先把它变成一个局部变量。不然就会变成无限循环了。
            ws.push(ws[j].concat([nums[i]]));
        }
    }
    return ws;
};

