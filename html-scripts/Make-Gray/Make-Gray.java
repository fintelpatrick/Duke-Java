var img;

function upload(){
  var canv = document.getElementById("canv");
  var inp = document.getElementById("filesel");
  img = new SimpleImage(inp);
  img.drawTo(canv);
}
function makeGray(){
  var img2 = img;
  for (var pix of img2.values()){
    var avg = (pix.getRed() + pix.getBlue() + pix.getGreen())/3;
    pix.setRed(avg);
    pix.setBlue(avg);
    pix.setGreen(avg);
   }
  var canv = document.getElementById("canv2");
  img2.drawTo(canv);
}
