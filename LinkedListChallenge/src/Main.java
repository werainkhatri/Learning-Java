import java.util.*;

public class Main {

    private static ArrayList<Album> albumArrayList = new ArrayList<Album>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 14.5);
        album.addSong("We Will", 15.7);
        album.addSong("ABCDE", 1.8);
        album.addSong("Holy Moly", 4.8);
        album.addSong("12345", 5.8);
        albumArrayList.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.47);
        album.addSong("AHNGF", 6.84);
        album.addSong("135560", 7.54);
        album.addSong("For all of us", 5.84);
        album.addSong("Sing Along", 8.74);
        album.addSong("C.O.D", 6.54);
        albumArrayList.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albumArrayList.get(1).addToPlaylist("AHNGF", playlist);
        albumArrayList.get(0).addToPlaylist("Holy Moly", playlist);
        albumArrayList.get(1).addToPlaylist("135560", playlist);
        albumArrayList.get(0).addToPlaylist(3, playlist);
        albumArrayList.get(1).addToPlaylist(4, playlist);
        albumArrayList.get(0).addToPlaylist(1, playlist);
        albumArrayList.get(1).addToPlaylist(6, playlist);

//        play(playlist);
        char x = 'a';
        int a = x;
        System.out.println(a);
    }

    private static void printMenu() {
        System.out.println("Choose Option\n" +
                "0 - quit\n" +
                "1 - Play Next Song\n" +
                "2 - Play Previous Song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - to remove the current song from the playlist\n" +
                "6 - print available options");
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We have reached the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext())
                            System.out.println("Song removed successfully. Now Playing " + listIterator.next());
                        else if(listIterator.hasPrevious())
                            System.out.println("Song removed successfully. Now Playing " + listIterator.previous());
                    } else {
                        System.out.println("Playlist Empty!");
                    }
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }
}
