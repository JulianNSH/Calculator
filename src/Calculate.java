public class Calculate {

    double doCalc(int n, double x, double y, double res){
        switch (n){
            case 1:
                return x+y;
            case 2:
                return x-y;
            case 3:
                return x*y;
            case 4:
                return x/y;
        }
        return 0;
    }
}
