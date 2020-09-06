package Lista2308Jole;

public class Lista {
private Nodo primeiroNodo;
/* 
 * Início
 * Armazena o Nodo que será o primeiroNodo elemento da lista
 * (primeira posição) */
	public Lista(String dado){
		Nodo primeiroNodo = new Nodo(dado);
		this.primeiroNodo = primeiroNodo;
	}
	public Lista(){
		this.primeiroNodo = null;	
	}
       /**
	 *
         * Adiciona um novo elemento ao final da lista
	 * @param dado String conteudo a ser adicionado
         *
	 */
	public void adicionarNodo(String dado){
		if(primeiroNodo == null){
			primeiroNodo = new Nodo(dado);
		}else{
			Nodo novoNodo = new Nodo(dado);
			Nodo nodoAux = primeiroNodo; 
			
			while (nodoAux.getProximo() != null){
				nodoAux = nodoAux.getProximo(); 
			}
			nodoAux.setProximo(novoNodo);	// Passa para o próximo
		}
	}
	/**
  	 *
	 *Imprime o conteudo da lista
	 * 
         * */ 
	public void imprimirNodo(){
		Nodo nodoAux = primeiroNodo;
		while(nodoAux.getProximo() != null ){
			// Imprimir as informações do Nodo
			System.out.println(nodoAux.getDado()); 
			nodoAux = nodoAux.getProximo();
		}
		System.out.println(nodoAux.getDado());	
	}
	/** 
	 * Metodo que retorna em que posiçao esta determinada 
	 * ocorrencia do dado
	 * @param dado String dado a ser encontrado
	 * @return a posiçao do dado na lista (Iniciando em 0)
	 * */
	public int posicaoNodo(String dado){
		Nodo nodoAux = primeiroNodo;
		int cont = 0;
		while(nodoAux!= null){
			if(nodoAux.getDado().equals(dado)){
				return cont;
			}else{
				cont ++;
				nodoAux = nodoAux.getProximo();
			}
		}
		return -1; // Em caso de fora do escopo
	}
	 /** 
	 * Metodo que remove o nodo
	 * @param dado 
	 * */
	public void removerNodo(String dado){
		Nodo nodoAux = primeiroNodo;
		if(primeiroNodo.getDado().equalsIgnoreCase(dado)){
			primeiroNodo = primeiroNodo.getProximo();
		}else{
			do{
			
			if(nodoAux.getProximo().getDado().equalsIgnoreCase(dado)){
				//Se o dado for encontrado, entra neste IF
				nodoAux.setProximo(nodoAux.getProximo().getProximo());
				}else{
				nodoAux = nodoAux.getProximo();
				}
		}while(nodoAux.getProximo() != null); // Parar caso não haja mais nodos
			}
		}
	}
