// https://www.codewars.com/kata/55b42574ff091733d900002f

function friend(friends) {
  let besties = [];
  for (let name of friends) {
    if (name.length === 4) {
      besties.push(name);
    }
  }
  return besties;
}
