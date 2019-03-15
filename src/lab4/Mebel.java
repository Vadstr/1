package lab4;

public class Mebel {
    public String material = "дерево";
    public String name = "Defold";
    public double height = 1;
    public double width = 0.8;
    public double depth = 0.6;
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

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getDepth() { return depth; }
    public void setDepth(double depth) { this.depth = depth; }
}
