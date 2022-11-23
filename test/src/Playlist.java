import java.util.ArrayList;
import java.util.List;

public class Playlist implements Element{
    private String name;

    private List<Element> lista;

    public Playlist() {
        lista = new ArrayList<>();
    }

    public Playlist(String name) {
        this.name = name;
        lista = new ArrayList<>();

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPlaylist(this);
        for (Element element : lista) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        lista.add(element);
    }
}