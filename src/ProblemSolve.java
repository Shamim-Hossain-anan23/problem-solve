import java.util.*;

public class ProblemSolve {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(input.nextLine());
        List<StudentInformation> totalStudentsList = new ArrayList<StudentInformation>();
        for(int i = 0; i < numberOfStudents ; i++){
            int ID = input.nextInt();
            String firstName = input.next();
            double CGPA = input.nextDouble();

            StudentInformation SI = new StudentInformation(ID, firstName, CGPA);
            totalStudentsList.add(SI);
        }
        Collections.sort(totalStudentsList, Comparator.comparing(StudentInformation::getCGPA).reversed().
                thenComparing(StudentInformation::getFirstName).thenComparing(StudentInformation::getID));
        System.out.println();

        for (StudentInformation st : totalStudentsList) {
            System.out.println(st.getFirstName());
        }
    }
}




