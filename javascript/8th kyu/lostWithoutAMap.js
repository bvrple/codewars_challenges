// https://www.codewars.com/kata/57f781872e3d8ca2a000007e

function maps(x) {
  let list = [];
  for (let num of x) {
    num = num * 2;
    list.push(num);
  }
  return list;
}
