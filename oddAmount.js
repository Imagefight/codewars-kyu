/* Find a Number that Appears an Odd amount of times.
 * There will always be only one integer that appears an odd number of times.
 * There will be no edge cases (Letters instead of numbers, empty values, etc.)
 */
function findOdd(A) {
  // Empty placeholder data
  let something;
  // Loop through the array and assign whatever shows up an odd amount of times to the placeholder data
  A.forEach(number =>{
    if (getOccurrences(A, number) % 2 !== 0) {something = number;}
  })
  // return the data.
  return something;
}

// Javascript does filtering for you, use it!
function getOccurrences(array, value) {
    // Filter array for value v and use .length to count how many showed up to the bar
    return array.filter((v) => (v === value)).length;
}
