public class Song extends Ind implements Element{
    public Song(String name, int dimensine) {
        super(name, dimensine);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitSong(this);
    }
}