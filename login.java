import java.util.Scanner;

public class login {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to online Examination Portal ....!");
        String name = null;
        String mail = null;
        String pass = null;

        while(true) {
            System.out.println("1.Signup");
            System.out.println("2.Login");
            System.out.print("Enter your option :");
            int op = sc.nextInt();


            if (op == 1) {
                System.out.println("---SignUp---");

                System.out.println("Enter your Name:");
                name = sc.next();

                System.out.println("Enter your Mail:");
                mail = sc.next();

                System.out.println("Enter your Password:");
                pass = sc.next();

                System.out.println("Registration Successful !!");
            }

            if (op == 2) {
                System.out.println("---Login---");

                System.out.print("Enter your mail:");
                String mail1 = sc.next();

                System.out.print("Enter your Password:");
                String pass1 = sc.next();

                if (mail1.equals(mail) && pass1.equals(pass)) {
                    System.out.println("Successfully login..!!!");
                            while(true) {
                                System.out.println("1.My Account");
                                System.out.println("2.Exam");
                                System.out.println("3.About");
                                System.out.println("4.Exit");
                                int option = sc.nextInt();
                                if(option == 4){
                                    return;
                                }
                                if (option == 1) {
                                    System.out.println("Name:" + name);
                                    System.out.println("Mail:" + mail);
                                }
                                if (option == 2) {
                                    System.out.println("1.Maths");
                                    System.out.println("2.Science");
                                    int sub = sc.nextInt();
                                    if (sub == 2) {
                                        System.out.println("There are 5 Question and Each carries 1 marks.");
                                        Science();
                                    }
                                    if (sub == 1) {
                                        System.out.println("There are 5 Question and Each carries 1 marks.");
                                        Maths();
                                    }
                                }
                                if (option == 3) {
                                    System.out.println("-------Exam Portal------");
                                    System.out.println("Designed by :\n" + "--------NIKHIL SABBAN");
                                }
                                }
                            }
                                  else {
                               System.out.println("Incorrect details..!!!");
                               }


            }
        }
    }

    static String Science(){
         Scanner sc = new Scanner(System.in);
        System.out.println();
        int score = 0;
         System.out.println("1.Which of the following is a non-metal that remains liquid at room temperature?\n" +
                 "\n" +
                 "A. Neon\n" +
                 "B. Bromine\n" +
                 "C. Chlorine\n" +
                 "D. Helium");
               String nik= sc.next();
             if(nik.equals("B")){
                 System.out.println("Correct Answer");
                 score=score+1;
             }
             else{
                 System.out.println("Incorrect Answer");
             }


        System.out.println("2.Which of the following metals forms an amalgam with other metals?\n" +
                "\n" +
                "A. Tin\n" +
                "B. Mercury\n" +
                "C. Lead\n" +
                "D. Zinc");
        String nik1= sc.next();
        if(nik1.equals("B")){
            System.out.println("Correct Answer");
            score=score+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }


        System.out.println("3.Which one of the following metals pollutes the air of a city having a large number of automobiles?\n" +
                "\n" +
                "A. Cadmium\n" +
                "B. Chromium\n" +
                "C. Lead\n" +
                "D. Copper");
        String nik2= sc.next();
        if(nik2.equals("C")){
            System.out.println("Correct Answer");
            score=score+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }

        System.out.println("4.Which of the following is used as a lubricant?\n" +
                "\n" +
                "A. Graphite\n" +
                "B. Silica\n" +
                "C. Iron Oxide\n" +
                "D. Diamond");
        String nik3= sc.next();
        if(nik3.equals("A")){
            System.out.println("Correct Answer");
            score=score+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }

        System.out.println("5.The inert gas which is substituted for nitrogen in the air used by deep sea divers for breathing, is\n" +
                "\n" +
                "A. Argon\n" +
                "B. Xenon\n" +
                "C. Helium\n" +
                "D. Krypton");
        String nik4= sc.next();
        if(nik4.equals("C")){
            System.out.println("Correct Answer");
            score=score+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }
        System.out.println("Your score is:" + score);

         return null;
     }



    static String Maths() {
        Scanner sc = new Scanner(System.in);
        int score1 = 0;
        System.out.println("1.What is the value of 2 + 2 x 2?\n" +
                "\n" +
                "A. 6\n" +
                "B. 8\n" +
                "C. 10\n" +
                "D. 12");
        String nu1 = sc.next();
        if(nu1.equals("B")){
            System.out.println("Correct Answer");
            score1=score1+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }

        System.out.println("2.What is the area of a circle with radius 5 cm?\n" +
                "\n" +
                "A. 10 pi cm^2\n" +
                "B. 25 pi cm^2\n" +
                "C. 50 pi cm^2\n" +
                "D. 100 pi cm^2");
        String nu2 = sc.next();
        if(nu2.equals("B")){
            System.out.println("Correct Answer");
            score1=score1+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }

        System.out.println("3.What is the value of x in the equation 3x - 5 = 10?\n" +
                "\n" +
                "A. 2\n" +
                "B. 3\n" +
                "C. 4\n" +
                "D. 5");
        String nu3 = sc.next();
        if(nu3.equals("C")){
            System.out.println("Correct Answer");
            score1=score1+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }

        System.out.println("4.What is the value of 5^0?\n" +
                "\n" +
                "A. 0\n" +
                "B. 1\n" +
                "C. 5\n" +
                "D. Undefined");
        String nu4 = sc.next();
        if(nu4.equals("B")){
            System.out.println("Correct Answer");
            score1=score1+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }

        System.out.println("What is the name of the longest side of a right triangle?\n" +
                "\n" +
                "A. Hypotenuse\n" +
                "B. Adjacent\n" +
                "C. Opposite\n" +
                "D. Base");
        String nu5 = sc.next();

        if(nu5.equals("A")){
            System.out.println("Correct Answer");
            score1=score1+1;
        }
        else{
            System.out.println("Incorrect Answer");
        }
        System.out.println("Your score is:"+ score1);


        return null ;

    }
    }
















