var fImg = null;

function upload(){
  var file = document.getElementById("file");
  fImg = new SimpleImage(file);
  var canv = document.getElementById("canv");
  fImg.drawTo(canv);
}
function makeGray(){
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
    var avg = (pix.getRed() + pix.getBlue() + pix.getGreen())/3;
    pix.setRed(avg);
    pix.setBlue(avg);
    pix.setGreen(avg);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
function makeRed(){
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
      pix.setRed(255);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
function makeBlue(){
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
      pix.setBlue(255);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
function makeGreen(){
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
      pix.setGreen(255);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
function makeRainbow(){
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
    var x = pix.getX();
    var y = pix.getY();
    var split7 = img2.getHeight() / 7;
    if (y <= split7){
      pix.setRed(255);
    }
    if (y <= split7*2 && y > split7){
      pix.setRed(255);
      pix.setGreen(220);
    }
    if (y <= split7*3 && y > split7*2){
      pix.setRed(255);
      pix.setGreen(255);
    }
    if (y <= split7*4 && y > split7*3){
      pix.setGreen(255);
    }
    if (y <= split7*5 && y > split7*4){
      pix.setGreen(255);
      pix.setBlue(255);
    }
    if (y <= split7*6 && y > split7*5){
      pix.setBlue(255);
    }
    if (y <= split7*7 && y > split7*6){
      pix.setBlue(255);
      pix.setRed(255);
    }
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
function clearCanv(x, y){
  if (y != null){
    var canv = document.getElementById(x);
    var canv2 = document.getElementById(y);
    var context = canv.getContext("2d");
    var context2 = canv2.getContext("2d");
    context.clearRect(0, 0, canv.width, canv.height);
    context2.clearRect(0, 0, canv2.width, canv2.height);
  }
  else{
    var canv = document.getElementById(x);
    var context = canv.getContext("2d");
    context.clearRect(0,0, canv.width, canv.height);
  }
}
function reset(){
  var canv = document.getElementById("canv");
  fImg.drawTo(canv);
  var canv2 = document.getElementById("canv2");
  var context = canv2.getContext("2d");
  context.clearRect(0,0, canv.width, canv.height);
}
