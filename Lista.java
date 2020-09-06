package Lista2308Jole;

public class Lista {
private Nodo primeiroNodo;

	public Lista(String dado){
		Nodo primeiroNodo = new Nodo(dado);
		this.primeiroNodo = primeiroNodo;
	}
	public Lista(){
		this.primeiroNodo = null;	
	}
	public void adicionarNodo(String dado){
		if(primeiroNodo == null){
			primeiroNodo = new Nodo(dado);
		}else{
			Nodo novoNodo = new Nodo(dado);
			Nodo nodoAux = primeiroNodo;
			
			while (nodoAux.getProximo() != null){
				nodoAux = nodoAux.getProximo();
			}
			nodoAux.setProximo(novoNodo);	
		}
	}
	public void imprimirNodo(){
		Nodo nodoAux = primeiroNodo;
		while(nodoAux.getProximo() != null ){
			System.out.println(nodoAux.getDado());
			nodoAux = nodoAux.getProximo();
		}
		System.out.println(nodoAux.getDado());	
	}
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
		return -1;
	}
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
		}while(nodoAux.getProximo() != null);
			}
		}
	}
