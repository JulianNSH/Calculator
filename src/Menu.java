import java.util.Scanner;

class Menu {
    Scanner scn = new Scanner(System.in);
    private double result=0;
    double x, y;
    int temp;

    //method for the first iteration
    int showSimpleMenu(){
        System.out.println("\n|=+-------CALCULATOR-------+=|");
        System.out.println("| 1. ADD                     |");
        System.out.println("| 2. SUBTRACT                |");
        System.out.println("| 3. MULTYPLY                |");
        System.out.println("| 4. DIVIDE                  |");
        System.out.println("| 0. EXIT                    |");
        System.out.print("  *. Option>>> ");

         temp = scn.nextInt();

        //exit option
        if (temp == 0) System.exit(1);

        //check selected option
        if (temp<0 || temp>4){
            System.out.println("!!!ERROR: Select an option between 0-4!!!\n");
            return showSimpleMenu();
        } else {
            return temp;
        }

    }

    //method for used after first iteration
    int showMainMenu(double result){
        System.out.println("|=+-------CALCULATOR-------+=|");
        System.out.println("| 1. ADD                     |");
        System.out.println("| 2. SUBTRACT                |");
        System.out.println("| 3. MULTYPLY                |");
        System.out.println("| 4. DIVIDE                  |");
        System.out.println("| 5. OPERATION WITH RESULT   |");
        System.out.println("| 6. CLEAR                   |");
        System.out.println("| 0. EXIT                    |");
        System.out.print("  *. Option>>> ");

         temp = scn.nextInt();

        //option for using current result
        if(temp == 5){
            this.result=result;
            temp=showSimpleMenu();
        }

        //clear option
        if(temp == 6){
            this.result=0;
            x = 0; y = 0;
            temp=showSimpleMenu();
        }

        //exit option
        if (temp == 0) System.exit(1);

        //check selected option
        if (temp<0 || temp>6){
            System.out.println("!!!ERROR: Select an option between 0-6!!!\n");
            return showMainMenu(result);
        } else {
            return temp;
        }



    }
    //method for input the values
    void inputMenu(){
        if (this.result ==0) {
            System.out.print("  *. Input Nr#1>>> ");
            this.x = scn.nextDouble();
        }else{
            System.out.println("  *. Input Nr#1>>> "+this.result);
            this.x = this.result;
        }
        System.out.print("  *. Input Nr#2>>> ");
        this.y = scn.nextDouble();
    }

    //show the result
    void showResult(double val){
        System.out.println("  *. RESULT = "+val);
        this.x=0; this.y=0;
    }
}
