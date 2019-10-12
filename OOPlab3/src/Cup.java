public class Cup extends Dish {
    private String content = "none";

    public Cup() {
    }

    public Cup(String content) {
        this.content = content;
    }

    public Cup(String material, double size, String picture, String content) {
        super(material, size, picture);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "content='" + content + '\'' +
                '}';
    }
}
