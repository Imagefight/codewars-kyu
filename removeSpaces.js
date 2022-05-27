// Take a string input and remove all spaces.
// Input will always be a string
// There will be no edge cases
function noSpace(x){
  //use the .replace() method in order to globally (using /g) replace all spaces with nothing ("")
  return x.replace(/ /g, "");
}
