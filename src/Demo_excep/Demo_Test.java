package Demo_excep;

public class Demo_Test {
    public static int divide(int x, int y) throws DivideByMinusException {
        if(x<0 ){
            throw new DivideByMinusException("除数不能为负数");

        }else {
            if (y == 0) {
                throw new DivideByMinusException ("被除数不能为0");
            }else {
                return x / y;
            }

        }


    }

    public static void main(String[] args){
        try {
        int result = divide (4,2);
        System.out.println(result);
        }catch (Exception e) {
            System.out.println("捕获了异常："+e.getMessage ());
        }

    }
}
