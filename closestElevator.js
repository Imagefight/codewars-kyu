function elevator(left, right, call){
  let lDist = left  - call;
  let rDist = right - call;
  let r     = "right";
  let l     = "left";
  
  if (lDist < 0) {lDist = lDist * -1;}
  if (rDist < 0) {rDist = rDist * -1;}
  
  if (lDist == rDist) {return r;}
  if (left  == call)  {return l;}
  if (right == call)  {return r;}
  
  return (lDist < rDist) ? l : r;
}
