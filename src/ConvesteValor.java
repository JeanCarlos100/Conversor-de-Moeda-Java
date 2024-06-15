import java.util.ArrayList;
import java.util.List;

public class ConvesteValor {
    private double valor;
    private  int opcao;
    private List<String> tiposDeMoeda = new ArrayList<>();

    public double getValor() {
        return valor;
    }

    public int getOpcao() {
        return opcao;
    }

    public List<String> getTiposDeMoeda() {
        return tiposDeMoeda;
    }

    public ConvesteValor(int opcao, double valor) {
        this.valor = valor;
        this.opcao = opcao;
        this.tiposDeMoeda.add("BRL");
        this.tiposDeMoeda.add("USD");
        this.tiposDeMoeda.add("EUR");
    }

    public double buscaMoedaConvestidor (int opcao){
        ConecaoDeEndereco conecaoDeEndereco = new ConecaoDeEndereco();
        String moedaAtual;
        String moedaConvertida;

        switch (opcao){
            case 1: //BRL -> USB
                moedaAtual = this.tiposDeMoeda.get(0);
                moedaConvertida = this.tiposDeMoeda.get(1);
                return conecaoDeEndereco.convestoDeMoeda(moedaAtual,moedaConvertida);
            case 2: //BRL -> EUR
                moedaAtual = this.tiposDeMoeda.get(0);
                moedaConvertida = this.tiposDeMoeda.get(2);
                return conecaoDeEndereco.convestoDeMoeda(moedaAtual,moedaConvertida);
            case 3: //USB -> BRL
                moedaAtual = this.tiposDeMoeda.get(1);
                moedaConvertida = this.tiposDeMoeda.get(0);
                return conecaoDeEndereco.convestoDeMoeda(moedaAtual,moedaConvertida);
            case 4: //EUR -> BRL
                moedaAtual = this.tiposDeMoeda.get(2);
                moedaConvertida = this.tiposDeMoeda.get(0);
                return conecaoDeEndereco.convestoDeMoeda(moedaAtual,moedaConvertida);
            case 5: //USB -> EUR
                moedaAtual = this.tiposDeMoeda.get(1);
                moedaConvertida = this.tiposDeMoeda.get(2);
                return conecaoDeEndereco.convestoDeMoeda(moedaAtual,moedaConvertida);
            case 6: //UER -> USB
                moedaAtual = this.tiposDeMoeda.get(2);
                moedaConvertida = this.tiposDeMoeda.get(1);
                return conecaoDeEndereco.convestoDeMoeda(moedaAtual,moedaConvertida);
        }
        return 0.0;
    }

    public double calcularMoeda(){

        return this.valor * buscaMoedaConvestidor(this.opcao);
    }

}
