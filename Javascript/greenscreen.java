//Function to lay image over greenscreen picture
//Only works with images the same size at the moment

function greenscreen_rep(img_g, img_f){
    var green_img = new SimpleImage(img_g);
    var back_img = new SimpleImage(img_f);
    var finished = new SimpleImage(back_img.getWidth(), back_img.getHeight())
    for (var pix of green_img.values()){
        var x = pix.getX();
        var y = pix.getY();
        if (pix.getGreen() > 250){
            var rep_pix = back_img.getPixel(x, y);
            var fin = finished.getPixel(x, y);
            fin.setRed(rep_pix.getRed());
            fin.setGreen(rep_pix.getGreen());
            fin.setBlue(rep_pix.getBlue());
        }
        else{
            var fin = finished.getPixel(x,y);
            fin.setRed(pix.getRed());
            fin.setGreen(pix.getGreen());
            fin.setBlue(pix.getBlue());
        }
    }
    return finished
}
print(greenscreen_rep('drewRobert.png', 'dinos.png'))
