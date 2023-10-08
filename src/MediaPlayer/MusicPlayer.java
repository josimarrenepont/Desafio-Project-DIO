package MediaPlayer;

import java.util.Scanner;

public class MusicPlayer {
    private boolean isPlaying = false;
    private String currentSong = null;

    public void play() {
        if (currentSong != null && !isPlaying) {
            System.out.println("Tocando: " + currentSong);
            isPlaying = true;
        } else if (currentSong != null) {
            System.out.println("A música já está tocando.");
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Pausando: " + currentSong);
            isPlaying = false;
        } else if (currentSong != null) {
            System.out.println("A música já está pausada.");
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void selectMusic(String songName) {
        currentSong = songName;
        isPlaying = false;
        System.out.println("Música selecionada: " + currentSong);
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Tocar");
            System.out.println("2 - Pausar");
            System.out.println("3 - Selecionar Música");
            System.out.println("0 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    System.out.println("Digite o nome da música:");
                    String songName = scanner.nextLine();
                    player.selectMusic(songName);
                    break;
                case 0:
                    System.out.println("Saindo do reprodutor de música.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
