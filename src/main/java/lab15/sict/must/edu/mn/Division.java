package lab15.sict.must.edu.mn;

/**
 * Хуваах боломж агуулсан класс, сайжруулсан алдааны мессежтэй.
 */
public class Division {
    /**
     * Эхний тоог хоёр дахь тоогоор хуваана.
     *
     * @param a эхний тоо (хуваагдагч)
     * @param b хоёр дахь тоо (хуваагч)
     * @return a-г b-д хуваасан ханшийг
     * @throws IllegalArgumentException хэрэв хуваагч тэг бол
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй: үйлдэл тодорхойлогдоогүй");
        }
        return a / b;
    }
}