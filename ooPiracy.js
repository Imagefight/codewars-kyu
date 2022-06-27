function Ship(draft,crew) {
 this.draft = draft;
 this.crew = crew;
}

//YOUR CODE HERE...
Ship.prototype.isWorthIt = function(){
  return ((this.draft - this.crew * 1.5 ) > 20);
}
