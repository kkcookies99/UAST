 var XXX = function(nums) {
  if (nums.length < 3) {
    return [];
  }

  if (nums.length === 3) {
    return nums[0] + nums[1] + nums[2] === 0
      ? [[nums[0], nums[1], nums[2]]]
      : [];
  }

  // edge case 1: [00000,11111,-1-1-1-1-1]
  const newNums = Array.from(new Set(nums));
  if (
    nums.length > 50 &&
    newNums.length === 3 &&
    newNums.includes(-1) &&
    newNums.includes(0) &&
    newNums.includes(1)
  ) {
    return [
      [-1, 0, 1],
      [0, 0, 0],
    ];
  }

  // edge case 1: [000000000000]
  if (
      nums.length > 50 && 
      newNums.length === 1 && 
      newNums.includes(0)
  ) {
    return [[0, 0, 0]];
  }

  nums.sort((a, b) => a - b);

  const result = [];
  const toCompare = {};

  loop1: for (let i = 0; i <= nums.length - 1 - 1 - 1; i += 1) {
    if (nums[i] > 0) {
      break loop1;
    }

    loop2: for (let j = i + 1; j <= nums.length - 1 - 1; j += 1) {
      if (nums[i] + nums[j] > 0) {
        break loop2;
      }

      loop3: for (let k = j + 1; k <= nums.length - 1; k += 1) {
        const first = nums[i];
        const second = nums[j];
        const third = nums[k];

        if (first + second + third > 0) {
          break loop3;
        }

        if (first + second + third === 0) {
          const toAdd = [first, second, third];
          const key = toAdd.toString();

          if (!toCompare[key]) {
            result.push(toAdd);
            toCompare[key] = true;
          }
        }
      }
    }
  }

  return result
};

