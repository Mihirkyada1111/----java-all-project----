
public class Constructor 
{
    int a, b, c, ans;
    String grade;
    float per;

    void ConstructorCv(int x, int y, int z) 
    {
        a = x;
        b = y;
        c = z;
    }

    void displayAns() 
    {
        ans = a + b + c;
    }

    void displayPer() 
    {
        per = ans / 3;
    }

    void display() 
    {
        System.out.println("a\tb\tc\ttotal\tper\tgrade");
    }

    void displayResult() 
    {
        System.out.println(a + "\t" + b + "\t" + c + "\t" + ans + "\t" + per + "\t" + grade);
    }

    void displaygrade() 
    {
        if (per < 35) {
            grade = "fail";
        } else if (per > 35 && per <= 50) {
            grade = "D";
        } else if (per > 50 && per <= 70) {
            grade = "C";
        } else if (per > 70 && per <= 90) {
            grade = "B";
        } else if (per > 90 && per <= 100) {
            grade = "A+";
        } else if (per > 35 && per <= 101) {
            grade = "fail";
            if (per < 35) 
            {
                grade = "fail";
            } 
            else 
            {
                grade = "put number between 0 to 100";
            }
        }
    }

    public static void main(String[] args) 
    {
        Constructor c = new Constructor();

        Constructor cv = new Constructor();
        cv.displayAns();
        cv.displayPer();
        cv.displayResult();
        cv.displaygrade();
    }
}
