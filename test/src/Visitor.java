public interface Visitor {
    void visitMediaPlayer(MediaPlayer mediaplayer);
    void visitPlaylist(Playlist playlist);
    void visitVideo(Video video);
    void visitGif(Gif gif);
    void visitSong(Song song);

    void pringSizes();
}