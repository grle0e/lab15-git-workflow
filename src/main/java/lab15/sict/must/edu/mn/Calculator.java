package lab15.sict.must.edu.mn;

/**
 * Энгийн тооцоолуурын класс үндсэн арифметик үйлдлүүдийг агуулна
 */
public class Calculator {
    
    /**
     * Хоёр тоог нэмнэ.
     *
     * @param a эхний тоо
     * @param b хоёр дахь тоо
     * @return a ба b-ийн нийлбэр
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Эхний тооноос хоёр дахь тоог хасна.
     *
     * @param a эхний тоо
     * @param b хоёр дахь тоо
     * @return a ба b-ийн ялгавар
     */
    public double subtract(double a, double b) {
        return a - b;
    }
}