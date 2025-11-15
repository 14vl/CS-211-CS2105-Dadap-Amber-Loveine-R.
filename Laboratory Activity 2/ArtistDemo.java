public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

       Painter painter = new Painter("Juan Luna", "Filipino", 42, "Painter", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Jose Rizal", "Filipino", 35, "Writer", WritingStyle.NONFICTION);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Misty Copeland", "American", 38, "Dancer", DanceStyle.BALLET);
        dancer.displayInfo();

    }
}
