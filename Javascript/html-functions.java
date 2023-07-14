//Html java 1
function buttonOne(){
  alert('Button one has been clicked');
}
function noButton(){
  alert('No');
}
function buttonTwo(){
  alert('Barrrrrrfffffff');
}
function buttonThree(){
  alert('Eat it nerd!');
}
function confirmation(){
  confirm('Are you sure?');
}
function receive_OK(){
  var choice = confirmation();
  if (choice == undefined){
    alert("You (probably) clicked OK!");
  }
  else{
    alert('Something went wrong');
  }
}
function changeText(){
  var divElement1 = document.getElementById('d1');
  var divElement2 = document.getElementById('d2');
  var divElement3 = document.getElementById('d3');
  divElement1.innerHTML = 'eventually interesting something do should This';
  divElement2.innerHTML = "  <h2>!Town Buttons</h2>";
  divElement3.innerHTML = "<h3>s'nottuB</h3>";
}
function resetText(){
  var divElement1 = document.getElementById('d1');
  var divElement2 = document.getElementById('d2');
  var divElement3 = document.getElementById('d3');
  divElement1.innerHTML = 'This should do something interesting eventually';
  divElement2.innerHTML = "<h2>Button Town!</h2>";
  divElement3.innerHTML = "<h3>Buttons</h3><input type = 'button' value = 'One' onclick = 'buttonOne()'><input type = 'button' value = 'Two' onclick = 'buttonTwo()'><input type = 'button' value = 'Three' onclick = 'buttonThree()'><input type = 'button' value = 'Confirm' onclick = 'receive_OK()'><input type = 'button' value = 'No Button' onclick = noButton()>";
}
