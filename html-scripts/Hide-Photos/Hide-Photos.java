var fImg = null;
var hImg = null;

function upload(){
  var file = document.getElementById("file");
  fImg = new SimpleImage(file);
  var canv = document.getElementById("canv");
  fImg.drawTo(canv);
}
function upload2(){
  var file = document.getElementById("file2");
  hImg = new SimpleImage(file);
  var canv = document.getElementById("canv2");
  hImg.drawTo(canv);
}
function prepPhoto(colval){
  /*Compute color value, dropping the lower values*/
  var newval = Math.floor(colval/16) * 16;
  return newval;
}
function chop2hide(img){
  /* Preps a photo to be hidden */
  /*var img = new SimpleImage(fImg);*/
  for (var pix of img.values()){
    pix.setRed(prepPhoto(pix.getRed()));
    pix.setGreen(prepPhoto(pix.getGreen()));
    pix.setBlue(prepPhoto(pix.getBlue()));
  }
  /*var canv = document.getElementById("canv3");*/
  /*img.drawTo(canv);*/
  return img;
}
function hidePhoto(img){
  /* Hides a prepped photo with in another*/
  /*var img = new SimpleImage(hImg);*/
  for (var pix of img.values()){
      pix.setRed(pix.getRed() / 16);
      pix.setGreen(pix.getGreen() / 16);
      pix.setBlue(pix.getBlue() / 16);
  }
  /*var canv = document.getElementById("canv3");*/
  /*img.drawTo(canv);*/
  return img;
}
function combine(){
  var fac_img = new SimpleImage(fImg);
  var hid_img = new SimpleImage(hImg);
  var final = new SimpleImage(fImg.getWidth(), fImg.getHeight());
  fac_img = chop2hide(fac_img);
  hid_img = hidePhoto(hid_img);
  for (var pix of final.values()){
      var x = pix.getX();
      var y = pix.getY();
      var fac_pix = fac_img.getPixel(x,y);
      var hid_pix = hid_img.getPixel(x,y);
      pix.setRed(fac_pix.getRed() + hid_pix.getRed());
      pix.setGreen(fac_pix.getGreen() + hid_pix.getGreen());
      pix.setBlue(fac_pix.getBlue() + hid_pix.getBlue());
  }
  var canv = document.getElementById("canv3");
  final.drawTo(canv);
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
