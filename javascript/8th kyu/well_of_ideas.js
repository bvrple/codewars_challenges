// https://www.codewars.com/kata/57f222ce69e09c3630000212

function well(x) {
  let g = 0;
  let b = 0;
  for (idea of x) {
    if (idea === "good") {
      g += 1;
    }
    if (idea === "bad") {
      b += 1;
    }
  }

  if (b >= 0 && g === 0) {
    return "Fail!";
  }
  if (g >= 1 && g < 3) {
    return "Publish!";
  }
  if (g >= 3) {
    return "I smell a series!";
  }
}
