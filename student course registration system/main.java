
public class main
{
    private Static corDB coreDB = new coreDB();
    private static stdDB stdDB = new stdDB();
    private Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        while(true){
            dMain();
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    addCourse();
                    break;
                case 2:
                    addStd();
                    break;
                case 3:
                    courseDB.dcourse();
                    break;
                case 4:
                    regforcourse();
                    break;
                case 5:
                    dcourse();
                    break;
                case 6:
                    StdDB.dstd();
                    break;
                case 7:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
    
    private static void dMenu(){
        System.out.println("Main Menu");
        System.out.println("1.Add new Course");
        System.out.println("2.Add new Student");
        System.out.println("3.Display Avaible course");
        System.out.println("4.Register a Student for Course");
        System.out.println("5.Display Student details");
        System.out.println("6.Exit");
        
    }
    //***********************************************************************************
    private static void addCourse() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter course title: ");
        String title = scanner.nextLine();
        System.out.print("Enter course description: ");
        String description = scanner.nextLine();
        System.out.print("Enter course capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter course schedule: ");
        String schedule = scanner.nextLine();

        Course newCourse = new Course(courseCode, title, description, capacity, schedule);
        courseDatabase.addCourse(newCourse);
        System.out.println("Course added successfully!");
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student newStudent = new Student(studentID, name);
        studentDatabase.addStudent(newStudent);
        System.out.println("Student added successfully!");
    }

    private static void registerForCourse() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        Student student = studentDatabase.getStudent(studentID);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        Course course = courseDatabase.getCourse(courseCode);
        if (course == null) {
            System.out.println("Course not found!");
            return;
        }

        if (student.registerCourse(course)) {
            System.out.println("Registered successfully!");
        } else {
            System.out.println("Failed to register. Course may be full or already registered.");
        }
    }

    private static void dropCourse() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        Student student = studentDatabase.getStudent(studentID);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        Course course = courseDatabase.getCourse(courseCode);
        if (course == null) {
            System.out.println("Course not found!");
            return;
        }

        if (student.dropCourse(course)) {
            System.out.println("Dropped successfully!");
        } else {
            System.out.println("Failed to drop. Course may not be registered.");
        }
    }
}
