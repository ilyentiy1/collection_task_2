
public class IntFilter implements Filter<Integer> {
    @Override
    public Integer apply(Integer o) {
        return (int) Math.pow(o, 2);
    }
}
