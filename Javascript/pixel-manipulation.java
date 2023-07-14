// write your code here
var img = new SimpleImage(200, 200);
for (var pix of img.values()){
    pix.setRed(255);
    pix.setGreen(255);
    pix.setBlue(0);
}
print(img);

var img1 = new SimpleImage('chapel.png');
for (var pix of img1.values()){
    pix.setRed(255);
}
print(img1);

for (var pix of img1.values()){
    pix.setRed(0);
}
print(img1);

var img2 = new SimpleImage('eastereggs.jpg');
for (var pix of img2.values()){
    if (pix.getRed() > 70){
        pix.setRed(70);
    }
}
print(img2);

var img3 = new SimpleImage('astrachan.jpg');
for (pix of img3.values()){
    if (pix.getY() > 350){
        pix.setRed(0);
        pix.setGreen(0);
        pix.setBlue(0);
    }
}
print(img3);

var img4 = new SimpleImage('chapel.png');
for (pix of img4.values()){
    if (pix.getY() < 50){
        if (pix.getX() < 50){

        pix.setRed(0);
        pix.setGreen(255);
        pix.setBlue(0);
        }
    }
}
print(img4);

function topRightCorner(cornW, cornH, some_img, red, green, blue){
    var img = new SimpleImage(some_img);
    var from_right_max = img.getWidth() - cornW;
    for (pix of img.values()){
        if (pix.getX() > from_right_max){
            if(pix.getY() < cornH){
                pix.setRed(red);
                pix.setGreen(green);
                pix.setBlue(blue);
        }
    }
  }
    return img;
}

var img5 = new SimpleImage('lion.jpg');
//img5.setSize(600, 600)
print(topRightCorner(30, 60, 'chapel.png', 255, 255, 0));
print(topRightCorner(125, 20, img5, 255, 0, 0));

var count = 0;
var img6 = new SimpleImage(257, 200);
for (pix of img6.values()){
    pix.setRed(count);
    //pix.setGreen(200);
    //pix.setBlue(100);
    if (count >255){
        count = 0;
    }
    else{
        count = count + 1;
    }
}

print(img6);

var img7 = new SimpleImage('hilton.jpg');
var wid = img7.getWidth();
var third = wid / 3;
for (pix of img7.values()){
    if (pix.getX() < third){
        pix.setRed(255);
    }
    if (pix.getX() > third){
        if (pix.getX() < third * 2){
            pix.setGreen(255);
        }
    }
    if (pix.getX() > third * 2){
        pix.setBlue(255);
    }
}

print(img7);

var img8 = new SimpleImage('duke_blue_devil.png');
for (pix of img8.values()){
    if (pix.getBlue() == 255 && pix.getGreen() == 255 && pix.getRed() == 255){
        continue;
    }
    else{
        pix.setBlue(0);
        pix.setGreen(255);
        pix.setRed(255);
    }
}
print(img8);

//Fixed color box code
var img9 = new SimpleImage(200,200);
for (var px of img9.values()){
  var x = px.getX();
  var y = px.getY();
  if (x < img9.getWidth()/2){
    px.setRed(255);
  }
  if (y>img9.getHeight()/2){
    px.setBlue(255);
  }
  else{
      if (x < img9.getWidth()/2){
          continue;
      }
      if (x > img9.getWidth()/2){
          px.setGreen(255);
      }
  }
}
print (img9);
