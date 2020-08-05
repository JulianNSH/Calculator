
public class Calculator {
    public static void main(String[] args) {
        double result;

        //creating objects
        Menu option = new Menu();
        Calculate calc = new Calculate();

        //assign value from first menu input
        int a = option.showSimpleMenu();

        //infinite loop, is closed when user choose exit option
        while (true){
            try {
                //get values from keyboard input
                option.inputMenu();

                //send values to method and get the result of operation
                result = calc.doCalc(a, option.x, option.y);

                //show the answer in console
                option.showResult(result);

                //repeat with new option
                a = option.showMainMenu(result);

            } catch (Exception e){
                System.out.println("Error:" + e);
            }
        }


    }
}
