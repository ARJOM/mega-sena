package modelo;

public class Jogo {

    final int[] numeros;
    private int quantidade;

    public Jogo(int quantidade){
        numeros = new int[quantidade];
        this.quantidade = 0;
    }

    public boolean inserirNumero(int numero){
        if (estaLotado()){
            return false;
        } else if(ehInvalido()){
            return false;
        } else if (estaPresente(numero)){
            return false;
        }
        numeros[quantidade++] = numero;
        return true;
    }

    private boolean estaPresente(int numero){
        for (int i=0; i < quantidade; i++){
            if (numeros[i] == numero){
                return true;
            }
        }
        return false;
    }

    public boolean estaLotado(){
        return  quantidade == numeros.length;
    }

    private boolean ehInvalido (int numero){
        return numero < 1 || numero > 60;
    }

    public int[] getNumeros(){
        return numeros;
    }

}
