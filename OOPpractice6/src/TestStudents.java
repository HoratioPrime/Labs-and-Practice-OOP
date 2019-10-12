import java.util.Comparator;

public class TestStudents {
    public static void main(String[] args) {
        SortingStudentsByGPA srt = new SortingStudentsByGPA();
        Student[] students = new Student[]
                {new Student(13),new Student(12),
                        new Student(15),new Student(11),new Student(16)};
        for (var element: students) {
            System.out.print(element);
        }
        QuickSort(students, srt, 0, students.length - 1);
        System.out.println("\nAfter sort:");
        for (var element: students) {
            System.out.print(element);
        }

    }
    private static void QuickSort(Student[] array, Comparator cmp, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (cmp.compare(array[i],array[cur]) > 0) ) {
                i++;
            }
            while (j > cur && (cmp.compare(array[cur],array[j]) > 0) ) {
                j--;
            }
            if (i < j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        QuickSort(array, cmp, start, cur);
        QuickSort(array, cmp,cur+1, end);
    }
}
