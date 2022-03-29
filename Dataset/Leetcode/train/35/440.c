 var XXX = function(nums, target) {
    nums.push(target); //先插入
    let res = Array.from(new Set(nums)); //去重
    res.sort(function(a,b){ //小到大排序
        return a-b
    })
    return res.indexOf(target) //返回下标
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


