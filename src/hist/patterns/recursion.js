// parametrized recursion example
function sumOfN(n, sum) {
  if (n == 0) {
    return sum;
  }
  return sumOfN(n - 1, sum + n);
}
// console.log("Parametrized Recursion Example:");
// console.log(sumOfN(5, 0)); // Output: 15

// functioal recursion example
function sumOfN2(n) {
  if (n == 0) return 0;
  return n + sumOfN2(n - 1);
}
// console.log("Functional Recursion Example:");
// console.log(sumOfN2(5)); // Output: 15

// Revers an array
const n1 = 5;
const array1 = [1, 2, 3, 4, 5];
const n2 = 7;
const array2 = [1, 2, 3, 4, 5, 6, 7];

function reversArrayV1(index, arr, n) {
  if (index >= n / 2) return arr;
  let temp = arr[index];
  arr[index] = arr[n - index - 1];
  arr[n - index - 1] = temp;
  return reversArrayV1(index + 1, arr, n);
}

// console.log(reversArrayV1(0, array1, n1));

function reversArrayV2(index, arr, n) {
  if (index >= Math.floor(n / 2)) return;
  let temp = arr[index];
  arr[index] = arr[n - index - 1];
  arr[n - index - 1] = temp;
  reversArrayV2(index + 1, arr, n);
}

// reversArrayV2(0, array2, n2);
// console.log(array2);

const string = "madam";
const string2 = "madem";

function checkPallindrom(i = 0, string) {
  if (i >= Math.floor(string.length / 2)) return true;
  if (string[i] !== string[string.length - i - 1]) return false;
  return checkPallindrom(i + 1, string);
}

// console.log(checkPallindrom(0, string));
// console.log(checkPallindrom(0, string2));

