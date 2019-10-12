import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student first = (Student) o1;
        Student second = (Student) o2;
        if(first.getResScore() > second.getResScore()) {
            return 1;
        }else if(first.getResScore() < second.getResScore())
        {
            return -1;
        }
        return 0;
    }

}
