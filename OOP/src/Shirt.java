public class Shirt {
    private String index;
    private String type;
    private String color;
    private String size;

    Shirt(){}

    Shirt(String shirtInfo){
        String [] sArr = shirtInfo.split(",");
        index = sArr[0];
        type = sArr[1];
        color = sArr[2];
        size = sArr[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "index=" + index + '\n' +
                "type=" + type + '\n' +
                "color=" + color + '\n' +
                "size=" + size + '\n' +
                '}';
    }
}
