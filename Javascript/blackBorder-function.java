function blackBorder(img, size){
    var pic = new SimpleImage(img);
    var wid = pic.getWidth() - size;
    var hig = pic.getHeight() - size;
    for (var pix of pic.values()){
        var x = pix.getX();
        var y = pix.getY();
        if (x < size || x > wid){
            pix.setRed(0);
            pix.setGreen(0);
            pix.setBlue(0);
        }
        if (y < size || y > hig){
            pix.setRed(0);
            pix.setGreen(0);
            pix.setBlue(0);
        }
    }
    return pic
}

var pic = blackBorder('palm-and-beach.png', 10);
print(pic);
