public class Student {
    private int resScore;

    public Student() {
        resScore = 0;
    }

    public Student(int resScore) {
        this.resScore = resScore;
    }

    public int getResScore(){return resScore;}

    @Override
    public String toString() {
        return "Student{" +
                "resScore=" + resScore +
                '}';
    }
}
