public class Video  extends Ind implements Element {
    public Video(String name, int dimensiune) {
        super(name, dimensiune);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVideo(this);
    }
}