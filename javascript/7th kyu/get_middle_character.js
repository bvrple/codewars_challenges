// https://www.codewars.com/kata/56747fd5cb988479af000028

function getMiddle(s) {
  let i = 0;
  for (letter of s) {
    if (s.length % 2 == 0) {
      i = s.length / 2 - 1;
      return s.slice(i, i + 2);
    } else if (s.length % 2 != 0) {
      i = s.length / 2 - 0.5;
      return s.slice(i, i + 1);
    }
  }
}
