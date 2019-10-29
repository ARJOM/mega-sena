package modelo;

public class Loterica {

    private Jogo[] jogos;
    private int quantidade;

    public Loterica(int jogos) {
        this.jogos = new Jogo[jogos];
        quantidade = 0;
    }

    public Jogo[] getJogos() {
        return jogos;
    }

    public boolean addJogo (Jogo jogo){
        if (estaLotado()){
            return false;
        }
        jogos[quantidade++] = jogo;
        return true;
    }

    public boolean estaLotado(){
        return  quantidade == jogos.length;
    }

    public float calculaTotal(){
        float soma = 0;
        for (int i = 0; i < quantidade; i++){
            switch (jogos[i].getNumeros().length){
                case 6: soma += 3.50; break;
                case 7: soma += 24.50; break;
                case 8: soma += 98.00 ; break;
                case 9: soma += 294.00; break;
                case 10: soma += 735.00; break;
                case 11: soma += 1617.00; break;
                case 12: soma += 3234.00; break;
                case 13: soma += 6006.00; break;
                case 14: soma += 10510.50; break;
                case 15: soma += 17517.50; break;
            }
        }
        return soma;
    }

}
