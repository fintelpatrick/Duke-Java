/*** Java code to manipulate an Image ***/

/* Initializing the file variable to null */
var fImg = null;

function upload(){
  /* Uploads a photo file to the first canvas */
  var file = document.getElementById("file");
  fImg = new SimpleImage(file);
  var canv = document.getElementById("canv");
  fImg.drawTo(canv);
}

function makeGray(){
  /* Casts the Image in Gray-scale */
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
  /* Cast the image Red tone */
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
      pix.setRed(255);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}

function makeBlue(){
  /* Cast the image Blue tone */
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
      pix.setBlue(255);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}

function makeGreen(){
  /* Cast the image Green tone */
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
      pix.setGreen(255);
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}

function makeRainbow(){
  /* Cast the image into a Rainbow */
  var img2 = new SimpleImage(fImg);
  for (var pix of img2.values()){
    var x = pix.getX();
    var y = pix.getY();
    var split7 = img2.getHeight() / 7;
    var avg = ((pix.getRed() + pix.getGreen() + pix.getBlue()) / 3);
    if (y <= split7){              /* set Red */
      if (avg < 128){
        pix.setRed(2*avg);
        pix.setGreen(0);
        pix.setBlue(0);
      }
      if (avg >= 128){
        pix.setRed(255);
        pix.setGreen(2*avg - 255);
        pix.setBlue(2*avg - 255);
      }
    }
    if (y <= split7*2 && y > split7){ /* set Orange */
      if (avg < 128){
        pix.setRed(2*avg);
        pix.setGreen(0.8*avg);
        pix.setBlue(0);
      }
      if (avg >= 128){
        pix.setRed(255);
        pix.setGreen(1.2*avg - 51);
        pix.setBlue(2*avg - 255);
      }
    }
    if (y <= split7*3 && y > split7*2){ /* set yellow */
      if (avg < 128){
        pix.setRed(2*avg);
        pix.setGreen(2*avg);
        pix.setBlue(0);
      }
      if (avg >= 128){
        pix.setRed(255);
        pix.setGreen(255);
        pix.setBlue(2*avg - 255);
      }
    }
    if (y <= split7*4 && y > split7*3){  /* set Green */
      if (avg < 128){
        pix.setRed(0);
        pix.setGreen(2*avg);
        pix.setBlue(0);
      }
      if (avg >= 128){
        pix.setRed(2*avg - 255);
        pix.setGreen(255);
        pix.setBlue(2*avg - 255);
      }
    }
    if (y <= split7*5 && y > split7*4){  /* Set Blue */
      if (avg < 128){
        pix.setRed(0);
        pix.setGreen(0);
        pix.setBlue(2*avg);
      }
      if (avg >= 128){
        pix.setRed(2*avg - 255);
        pix.setGreen(2*avg - 255);
        pix.setBlue(255);
      }
    }
    if (y <= split7*6 && y > split7*5){ /* Set Indigo */
      if (avg < 128){
        pix.setRed(0.8*avg);
        pix.setGreen(0);
        pix.setBlue(2*avg);
      }
      if (avg >= 128){
        pix.setRed(1.2*avg - 51);
        pix.setGreen(2*avg - 255);
        pix.setBlue(255);
      }
    }
    if (y <= split7*7 && y > split7*6){ /* Violet */
      if (avg < 128){
        pix.setRed(1.6*avg);
        pix.setGreen(0);
        pix.setBlue(1.6*avg);
      }
      if (avg >= 128){
        pix.setRed(0.4*avg - 153);
        pix.setGreen(2*avg - 255);
        pix.setBlue(0.4*avg - 153);
      }
    }
  }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
function clearCanv(x, y){
  /* Clear both or one canvas */
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
  /* Return to original Picture upload conditions */
  var canv = document.getElementById("canv");
  fImg.drawTo(canv);
  var canv2 = document.getElementById("canv2");
  var context = canv2.getContext("2d");
  context.clearRect(0,0, canv.width, canv.height);
}
