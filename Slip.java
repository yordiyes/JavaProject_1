// The Slip class is responsible for displaying a registration slip for a student
public class Slip {

    // Static arrays to store course information
    static String[] CourseList = {"Operating system                            ", "Fundamental of Networking                  ", "Probability and statistics                 ", "Computer organization and architecture       ", "Data Structure and Algorithms             ", "Object-Oriented programming                "};
    static int[] courseCreditHour ={4,4,3,3,3,3};   // Credit hours for each course
    static int[] courseECTS ={7,7,5,5,5,5};          // ECTS for each course

    // Constants for total credit hours and ECTS
    static final int[] totalCreditHour = {20};
    static final int[] totalECTS = {34};

    // Method to display the registration slip
    static void display_table() {
        // Displaying header information

        System.out.println("......................................................................................................................................");
        System.out.println("                                              Haramaya University                                                          ");
        System.out.println("......................................................................................................................................");
        System.out.println("                                             Department Of " + Student.department +"                                                  ");
        System.out.println("..................................................................................................................................... ");
        System.out.println("                  First-name: " + Student.fullName + "         Department"+ Student.department+"       ID-Number: " + Student.studentId);
        System.out.println("......................................................................................................................................");
        System.out.println("                    Modality : " + Student.modality + "    "+"Sex: " + Student.gender + "               "+"Year: "+ Student.studentYear);
        System.out.println("......................................................................................................................................");
        System.out.println("                Course                                   Credit Hour                       ECTS                                       ");
        System.out.println("......................................................................................................................................");
        System.out.println("1.     " + CourseList[0] + "             " + courseCreditHour[0] + "                          " + courseECTS[0]);
        System.out.println("2.     " + CourseList[1] + "              " + courseCreditHour[1] + "                          " + courseECTS[1]);
        System.out.println("3.     " + CourseList[2] + "              " + courseCreditHour[2] + "                          " + courseECTS[2]);
        System.out.println("4.     " + CourseList[3] + "            " + courseCreditHour[3] + "                          " + courseECTS[3]);
        System.out.println("5.     " + CourseList[4] + "               " + courseCreditHour[4] + "                          " + courseECTS[4]);
        System.out.println("6.     " + CourseList[5] + "              " + courseCreditHour[5] + "                          " + courseECTS[5]);
        System.out.println(".......................................................................................................................................");
        System.out.println("                                                    TOTAl Chr:" + totalCreditHour[0] + "                    TOTAL ECTS:" + totalECTS[0]);
        System.out.println(".......................................................................................................................................");
        System.out.println("                                            Registered successfully                                                            ");
        System.out.println(".......................................................................................................................................");
        }
}

