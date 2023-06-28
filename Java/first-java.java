// write your code here
var x = 3;
var y = 3 * x;

function square(x){
    var y = x * x;
    return y;
}
var s = square(30.12)
//print(s)

var img = new SimpleImage('lion.jpg');
var hig = img.getHeight();
var wid = img.getWidth();
//print(wid, hig)
var pic = new SimpleImage(wid/4, hig/4);
img.setSize(wid/4, hig/4)
//print(pic, img)

function phrase3words(val1, val2, val3){
    var ans = val1 + ' ' + val2 + ' ' + val3 + '.'
    return ans;
}

function last_first(first, last){
    var ans = last + ', ' + first
    return ans;
}

function numberPixels(namefile){
    var img = new SimpleImage(namefile);
    var wid = img.getWidth();
    var hig = img.getHeight();
    var ans = wid * hig
    return ans;
}

function picPerimeter(namefile){
    var img = new SimpleImage(namefile);
    var wid = img.getWidth();
    var hig = img.getHeight();
    var ans = (wid * 2) + (hig * 2)
    return ans;
}

print(picPerimeter('nyc-skyline.jpg'))

//Html java 1
function buttonOne(){
  alert('Button one has been clicked');
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
  if (choice == true){
    alert('You pressed ok!');
  }
  else{
    alert('Something went wrong');
  }
}
