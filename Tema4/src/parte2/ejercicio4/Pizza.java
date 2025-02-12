package parte2.ejercicio4;

public class Pizza {
	// Variables
	private int codigo;
	private Tamaño tamaño;

	enum Tamaño {
		Mediana, Familiar
	}

	private Tipo tipo;

	enum Tipo {
		Margarita, CuatroQuesos, Funghi
	}

	private Estado estado = Estado.Pedida;

	enum Estado {
		Pedida, Servida
	}

	/**
	 * 
	 * @param codigo codigo de la pizza
	 * @param tamaño tamaño de la pizza
	 * @param tipo   tipo de pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		switch (tamaño) {
		case "Familiar":
			this.tamaño = Tamaño.Familiar;
		default:
			this.tamaño = Tamaño.Mediana;
		}
		switch (tipo) {
		case "Margarita":
			this.tipo = Tipo.Margarita;
		case "Cuatro quesos":
			this.tipo = Tipo.CuatroQuesos;
		default:
			this.tipo = Tipo.Funghi;
		}
	}

	/**
	 * 
	 * @return codigo de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo codigo de la pizza
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return tamaño de la pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * 
	 * @param tamaño tamaño de la pizza
	 */
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * 
	 * @return tipo de la pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo tipo de la pizza
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @return estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado estado de la pizza
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * @return Información de la pizza
	 */
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}

	/**
	 * @return true si las dos pizzas son iguales, false si son diferentes
	 */
	public boolean equals(Object obj) {
		boolean res = false;
		Pizza pizza2 = (Pizza) obj;
		if (codigo == pizza2.codigo) {
			res = true;
		}
		return res;
	}

}
