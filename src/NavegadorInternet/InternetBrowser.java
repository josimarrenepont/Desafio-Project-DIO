package NavegadorInternet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternetBrowser {
    private List<String> tabs = new ArrayList<>();

    public void displayPage(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void addTab(String url) {
        tabs.add(url);
        System.out.println("Nova aba adicionada: " + url);
    }

    public void refreshPage() {
        if (!tabs.isEmpty()) {
            String currentTab = tabs.get(tabs.size() - 1);
            System.out.println("Atualizando página: " + currentTab);
        } else {
            System.out.println("Nenhuma aba aberta para atualizar.");
        }
    }

    public static void main(String[] args) {
        InternetBrowser browser = new InternetBrowser();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Exibir Página");
            System.out.println("2 - Adicionar Nova Aba");
            System.out.println("3 - Atualizar Página");
            System.out.println("0 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    System.out.print("Digite a URL da página: ");
                    String url = scanner.nextLine();
                    browser.displayPage(url);
                    break;
                case 2:
                    System.out.print("Digite a URL da nova aba: ");
                    String newTabUrl = scanner.nextLine();
                    browser.addTab(newTabUrl);
                    break;
                case 3:
                    browser.refreshPage();
                    break;
                case 0:
                    System.out.println("Fechando o navegador.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
