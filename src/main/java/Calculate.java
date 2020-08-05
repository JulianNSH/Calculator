public class Calculate {

    double doCalc(int n, double x, double y){
        double temp=0;
        switch (n){
            case 1:
                temp = x+y;
                break;
            case 2:
                temp = x-y;
                break;
            case 3:
                temp = x*y;
                break;
            case 4:
                temp =  x/y;
                break;
        }
        return temp;
    }
}
