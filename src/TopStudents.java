public class TopStudents {
    static class Student {
        String name;
        double averageGrade;

        Student(String name, double averageGrade) {
            this.name = name;
            this.averageGrade = averageGrade;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Ana", 18.5),
                new Student("Luis", 16.0),
                new Student("Maria", 19.2),
                new Student("Pedro", 15.7),
                new Student("Sofia", 18.5)
        };

        int iterations = 0;
        for (int i = 0; i < students.length - 1; i++) {
            int highestGradeIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                iterations++;
                if (students[j].averageGrade > students[highestGradeIndex].averageGrade) {
                    highestGradeIndex = j;
                }
            }

            Student temporary = students[i];
            students[i] = students[highestGradeIndex];
            students[highestGradeIndex] = temporary;
        }

        System.out.println("Top 3 students by average grade:");
        System.out.println("Comparison iterations: " + iterations);
        for (int i = 0; i < Math.min(3, students.length); i++) {
            Student student = students[i];
            System.out.println((i + 1) + ". " + student.name
                    + " - Average grade: " + student.averageGrade);
        }
    }
}
