package AparelhoTelefonico;

import java.util.Scanner;

public class Telephone {
    private boolean isOn = false;
    private boolean isCallInProgress = false;
    private boolean isVoiceMailActive = false;

    public void turnOn() {
        if (!isOn) {
            System.out.println("Ligando o telefone.");
            isOn = true;
        } else {
            System.out.println("O telefone já está ligado.");
        }
    }

    public void call() {
        if (isOn && !isCallInProgress) {
            System.out.println("Chamando...");
            isCallInProgress = true;
        } else if (isOn) {
            System.out.println("Já existe uma chamada em andamento.");
        } else {
            System.out.println("O telefone está desligado.");
        }
    }

    public void answer() {
        if (isOn && isCallInProgress) {
            System.out.println("Atendendo a chamada.");
            isCallInProgress = false;
        } else if (isOn) {
            System.out.println("Não há chamada para atender.");
        } else {
            System.out.println("O telefone está desligado.");
        }
    }

    public void startVoiceMail() {
        if (isOn && !isVoiceMailActive) {
            System.out.println("Iniciando correio de voz.");
            isVoiceMailActive = true;
        } else if (isOn && isVoiceMailActive) {
            System.out.println("O correio de voz já está ativo.");
        } else {
            System.out.println("O telefone está desligado.");
        }
    }

    public static void main(String[] args) {
        Telephone phone = new Telephone();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Chamada");
            System.out.println("3 - Atender Chamada");
            System.out.println("4 - Iniciar Correio de Voz");
            System.out.println("0 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    phone.turnOn();
                    break;
                case 2:
                    phone.call();
                    break;
                case 3:
                    phone.answer();
                    break;
                case 4:
                    phone.startVoiceMail();
                    break;
                case 0:
                    System.out.println("Desligando o telefone.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
