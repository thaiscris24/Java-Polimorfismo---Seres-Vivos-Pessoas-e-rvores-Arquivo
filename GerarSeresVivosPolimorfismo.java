public class GerarSeresVivosPolimorfismo {
    public static void main(String[] args) {
        // cria objetos de subclasse
        Pessoas pessoaUm = new Pessoas(1977, "marcelo", 0);
        Arvores arvoreUm = new Arvores(1913, 0, "Carvalho", 0);
        System.out.println("Seres Vivos processados individualmente:\n");
        pessoaUm.gerarIdade(2020);
        System.out.println(pessoaUm);
        arvoreUm.gerarIdade(2020);
        System.out.println(arvoreUm);
        // cria um array
        SeresVivos seres[] = new SeresVivos[2];
        // inicializa o array
        seres[0] = pessoaUm;
        seres[1] = arvoreUm;
        System.out.println("\n Seres Vivos processados utilizando POLIMORFISMO \n");
        // processa genericamente cada elemento/objeto
        for (SeresVivos serCorrente : seres) {
            serCorrente.gerarIdade(2020);
            System.out.println(serCorrente); // invoca toString
        }
    }
}
