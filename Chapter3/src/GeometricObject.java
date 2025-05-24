public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    GeometricObject(){
        color = "red";
        filled = false;
    }
    GeometricObject(String c, boolean f){
        color = c;
        filled = f;
    }
    public String getColor(){
        return this.getColor();
    }
    public void setColor(String s){
        color = s;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean f){
        filled = f;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        String s = "This geometric object has color " + color + "and its fill is " + filled;
        return s;
    }
}
