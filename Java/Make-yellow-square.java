// write your code here
var img = new SimpleImage(200, 200);
for (var pix of img.values()){
    pix.setRed(255);
    pix.setGreen(255);
    pix.setBlue(0);
}
print(img)

var img1 = new SimpleImage('chapel.png');
for (var pix of img1.values()){
    pix.setRed(255);
}
print(img1)

for (var pix of img1.values()){
    pix.setRed(0);
}
print(img1)

var img2 = new SimpleImage('eastereggs.jpg');
for (var pix of img2.values()){
    if (pix.getRed() > 70){
        pix.setRed(70)
    }
}
print(img2)

var img3 = new SimpleImage('astrachan.jpg');
for (pix of img3.values()){
    if (pix.getY() > 350){
        pix.setRed(0);
        pix.setGreen(0);
        pix.setBlue(0);
    }
}
print(img3)

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
print(img4)

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
    return img
}

var img5 = new SimpleImage('lion.jpg')
//img5.setSize(600, 600)
print(topRightCorner(30, 60, 'chapel.png', 255, 255, 0));
print(topRightCorner(125, 20, img5, 255, 0, 0))

var count = 0
var img6 = new SimpleImage(257, 200)
for (pix of img6.values()){
    pix.setRed(count)
    //pix.setGreen(200)
    //pix.setBlue(100)
    if (count >255){
        count = 0
    }
    else{
        count = count + 1
    }
}

print(img6)
