public class CharFilter implements Filter<Character>{
    @Override
    public Character apply(Character o) {
        return (char)((int) o + 5);
    }
}
