public class Power_Tower {

    public static int total = 0;

    public static void main(String[] args)
    {
        System.out.println("Power Tower: " + PowerTower(2, 3, 1));
        for(int i = 1; i <= 8; i++)
        {
            System.out.println("Fib: " + Fib(1, 1, 1, i, 4) + " ");
        }

        System.out.println(" ");

        for(int i = 0; i <= 4; i++)
        {
            System.out.println("rCal: " + rCal(1, i, 0) + " ");
        }
    }

    public static int PowerTower(int a, int k, int count)
    {
        if(count <= k)
        {
            a = a*a;
            return PowerTower(a, k, count + 1);
        }
        return a;
    }

    public static int Fib(int num1, int num2, int num3, int k, int count)
    {
        if(count <= k)
        {
            int temp = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = temp;
            return Fib(num1, num2, num3, k, count + 1);
        }
        return num3;
    }

    public static int rCal(int a, int k, int count)
    {
        if(count < k)
        {
            a = (3 * a) +2;
            return rCal(a, k, count + 1);
        }
        return a;
    }
}
