//importing the appropriate libraries
import java.util.InputMismatchException;
import java.util.Scanner;
// This is a demo student registration system program for 2nd year 2nd semester software engineering students at Haramaya University
public class Main {
    
    public static void main(String[] args) {
        System.out.println("-------WELCOME TO STUDENT REGISTRATION SYSTEM--------\n");
        System.out.println("----- PLEASE ENTER THE NECESSARY INFORMATION---------");
        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop to keep prompting for registration until the user decides to exit
        while(true) {

            while (true) {
                try {
                    System.out.print("Enter Your Full name: ");
                    Student.fullName = scanner.nextLine().toUpperCase();
                    if (Student.fullName.matches("[a-zA-Z+' ']+")) {
                        Student.fullName = Student.fullName;
                        break;
                    } else {
                        throw new InputMismatchException();
                    }

                } catch(InputMismatchException e){
                    System.out.println("Invalid input, Please enter the appropriate value");
                }
            }

            // Start a nested loop for entering the student ID, handling InputMismatchException
            while (true) {
                try {
                    System.out.print("Enter student ID: ");
                    Student.studentId = scanner.nextInt();
                    scanner.nextLine();
                    
                    // Check if the entered student ID is less than or equal to 0
                    if (Student.studentId <= 0) {
                        throw new InputMismatchException("Your ID is less than 0, enter again. ");
                    } else {
                        break; // Break out of the loop if the input is valid
                    }
                } catch (InputMismatchException e) {
                    // Handle the InputMismatchException and prompt the user to enter the appropriate value
                    System.out.println("Invalid Input. Please enter the appropriate value");
                }
                scanner.nextLine(); // Consume the remaining newline character
            }


            while (true) {
                try {
                    System.out.print("Enter Your Department: ");
                    Student.department = scanner.nextLine().toUpperCase();
                    if (Student.department.matches("[a-zA-Z+' ']+")) {
                        Student.department = Student.fullName;
                        break;
                    } else {
                        throw new InputMismatchException();
                    }

                } catch(InputMismatchException e){
                    System.out.println("Invalid input, Please enter the appropriate value");
                }
            }
            // Start a nested loop for entering the batch year, handling InputMismatchException
            while (true) {
                try {
                    System.out.print("Enter your year: ");
                    Student.studentYear = scanner.nextInt();
                    scanner.nextLine();
                    
                    // Check if the entered batch year is less than or equal to 0
                    if (Student.studentYear <= 0) {
                        throw new InputMismatchException("Your Batch Year Is Less Than 0, Enter Again. ");
                    } else {
                        break; // Break out of the loop if the input is valid
                    }
                } catch (InputMismatchException e) {
                    // Handle the InputMismatchException and prompt the user to enter the appropriate value
                    System.out.println("Invalid Input. Please enter the appropriate value");
                }
                scanner.nextLine(); // Consume the remaining newline character
            }


            while (true) {
                try {
                    System.out.print("Enter your Gender:(male/female)");
                    Student.gender = scanner.nextLine().toUpperCase();
                    if (Student.gender.matches("[a-zA-Z+' ']+")) {
                        Student.gender = Student.fullName;
                        break;
                    } else {
                        throw new InputMismatchException();
                    }

                } catch(InputMismatchException e){
                    System.out.println("Invalid input, Please enter the appropriate value");
                }
            }


            while (true) {
                try {
                    System.out.print("Enter your Modality:(Regular/Extension) ");
                    Student.modality = scanner.nextLine();
                    if (Student.modality.matches("[a-zA-Z+' ']+")) {
                        Student.modality = Student.fullName;
                        break;
                    } else {
                        throw new InputMismatchException();
                    }

                } catch(InputMismatchException e){
                    System.out.println("Invalid input, Please enter the appropriate value");
                }
            }

            System.out.println("\n---Registered successfully---\n");

            // Ask the user if they want to print their slip
            System.out.println("Do You Want To Print Your Slip? yes/no");
            String slip = scanner.nextLine().toUpperCase();

            // Check the user's response and either display the slip or exit the program
            if (slip.equalsIgnoreCase("YES")) {
                Slip.display_table();
                break; // Exit the loop if the user chooses to print the slip
            } else {
                System.out.println("Exiting the program ...");
                break; // Exit the loop if the user chooses not to print the slip
            }
        }        
    }
}
