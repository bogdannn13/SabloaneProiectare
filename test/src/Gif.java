public class Gif extends Ind implements Element {
    public Gif(String name, int dimensine) {
        super(name, dimensine);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitGif(this);
    }
}