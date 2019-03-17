package lab4;

public class Mebel {
    public String material ;
    public String name ;
    public double height;
    public double width ;
    public double depth ;
    public Mebel (double height,double width, double depth, String material,String name) {
        this.material=material;
        this.name= name;
        this.height=height;
        this.width=width;
        this.depth= depth;
    }
    @Override
    public String toString() {
        return "|" + " Name='" + name + '\'' + "\t" +"Material='" + material + '\'' + "\t" + "Height=" + height  + "\t" + "Width=" + width + "\t" + "Depth=" + depth + "\t"+'|';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }


    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }


    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }


    public Double getDepth() {
        return depth;
    }
    public void setDepth(Double depth) {
        this.depth = depth;
    }
}
