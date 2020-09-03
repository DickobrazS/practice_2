public class ball1 {
    public String type;
    public float radius;
    public String color;

    public String toString(){
        String s="Тип мяча" + type + "\n" + "Радиус мяча" + radius+"\n" + "Цвет мяча" + color;
            return s;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }
}
