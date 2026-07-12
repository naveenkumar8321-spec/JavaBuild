package MainPackage;

public class Box {

    double length,width,height;

    Box()
    {
        length=width=height=0;
    }
    Box(double l, double w, double h)
    {
        length = l;
        width = w;
        height = h;
    }
    Box(double cube)
    {
        length=width=height=cube;
    }
    double calVolume ()
    {
       double Volume = (length*width*height);
       return Volume;
    }


}
