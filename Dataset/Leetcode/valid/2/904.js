 var XXX = function(l1, l2) {
        let arr = [];
        let a = [];// 存储进位
        a.push(0);
        let arr1 = [], arr2 = []
        if (l1.length >= l2.length) {
            arr1 = l1
            arr2 = l2
        } else {
            arr1 = l2
            arr2 = l1
        }
        for (var i = 0; i < arr1.length; i++) {
            for (var j = 0;j < arr2.length; j++) {
                if (i === j) {
                    if (arr1[i] + arr2[j] + a[i] > 9) {
                        arr.push(arr1[i] + arr2[j] + a[i] - 10);
                        a.push(1);
                    } else {
                        arr.push(arr1[i] + arr2[j] + a[i]);
                        a.push(0);
                    }
                } else if (j > i) {
                    break;
                }
            }
            if (arr2.length <= i) {
                if (arr1[i] + a[i] > 9) {
                    arr.push(arr1[i] + a[i]-10);
                    a.push(1);
                } else {
                    arr.push(arr1[i] + a[i]);
                    a.push(0);
                }
            }
        }
        if (a.length > arr.length && a[a.length -1] === 1) {
            arr.push(1);
        }
        
        return arr;
    };

