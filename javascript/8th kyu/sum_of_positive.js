// https://www.codewars.com/kata/5715eaedb436cf5606000381

function positiveSum(arr) {
  let sum = 0;
  for (let num of arr) {
    if (num > 0) {
      sum += num;
    }
  }
  return sum;
}
