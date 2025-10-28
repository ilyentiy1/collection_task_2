public class DoubleFilter implements Filter<Double>{
    @Override
    public Double apply(Double o) {
        return Math.pow(o, 0.8);
    }
}
