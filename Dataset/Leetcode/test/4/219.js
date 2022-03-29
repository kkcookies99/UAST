 var XXX = function(nums1, nums2) {
    const { length: length1 } = nums1, { length: length2 } = nums2, middleIndex = parseInt((length1 + length2) / 2), bool = (length1 + length2) % 2 === 0
    let index1 = parseInt(length1 / 2), index2 = parseInt(length2 / 2), 
        left1 = 0, right1 = length1 - 1, left2 = 0, right2 = length2 - 1
    if(length1 === 0) {
        if(bool) {
            return (nums2[middleIndex] + nums2[middleIndex - 1]) / 2
        } else {
            return nums2[middleIndex]
        }
    }
    if(length2 === 0) {
        if(bool) {
            return (nums1[middleIndex] + nums1[middleIndex - 1]) / 2
        } else {
            return nums1[middleIndex]
        }
    }
    // 过滤掉数组1与数组2中不可能的数字
    while(left1 !== right1 && left2 !== right2) {
        let num = index1 + index2 + 1
        if(nums1[index1] > nums2[index2]) {
            if(num > middleIndex) {
                right1 = index1 - 1
            } else if(num === middleIndex) {
                right1 = index1
                left2 = index2
            } else {
                left2 = index2 + 1
            }
        } else {
            if(num > middleIndex) {
                right2 = index2 - 1
            } else if(num === middleIndex) {
                right2 = index2
                left1 = index1
            } else {
                left1 = index1 + 1
            }
        }
        index1 = parseInt((left1 + right1) / 2)
        index2 = parseInt((left2 + right2) / 2)
    }
    // index表示中间位置可能在数组arr中的位置
    let arr, a, index = middleIndex - left1 - left2 - 1
    // a表示可能为中间数的数字， arr表示的可能中间数的数组数组
    if(left1 === right1) {
        arr = nums2.slice(left2, right2 + 1)
        a = nums1[index1]
    } else {
        arr = nums1.slice(left1, right1 + 1)
        a = nums2[index2]
    }
    if(bool) {
        if(arr[index] > a) {
            if(index > 0 && arr[index-1] > a) {
                return (arr[index - 1] + arr[index]) / 2
            }
            return (a + arr[index]) / 2
        }
        if(index < arr.length - 1 && arr[index+1] < a) {
            return (arr[index+1] + arr[index]) / 2
        }
        return (a + arr[index]) / 2 
    } else {
        if(arr[index] > a) {
            return arr[index]
        }
        if(index < arr.length - 1) {
            return arr[index + 1] > a ? a : arr[index + 1]
        }
        return a
    }
};

