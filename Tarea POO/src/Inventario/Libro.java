package Inventario;

public class Libro {
		private int codigo;
		private int cantidadexistente;
		private String titulo;
		private String autor;
		private double precio;
		
		public Libro(int codigo, int cantidadexistente, String titulo, String autor, double precio) {
			super();
			this.codigo = codigo;
			this.cantidadexistente = cantidadexistente;
			this.titulo = titulo;
			this.autor = autor;
			this.precio = precio;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getCantidadexistente() {
			return cantidadexistente;
		}

		public void setCantidadexistente(int cantidadexistente) {
			this.cantidadexistente = cantidadexistente;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			String lb = "Código: "+codigo +" - Cantidad existente: "+ cantidadexistente +" - Titulo: "+ titulo + " - Autor: "+ autor +" - Precio: "+ precio;
			return lb;
		}	
}