package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
		  
	       Bulbasaur b = new bulbasaur() {
		 
		 
			msg = "<center>" + b.getpokemon() + "  #" + b.getPokemon;
			request.setAttribute("message1",b.getPokemon);
			request.setAttribute("character1", b.getPokemonr);
			request.setAttribute("type1",b.getPokemon) ;
			request.setAttribute("evolution1",b.getPokemonr);
			request.setAttribute("baseExp1", b.getPokemon);
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard c = new Charizard();{
			  
				msg = "<center>" + b.getpokemon() + "  #" + b.getPokemon;
				request.setAttribute("message1",b.getPokemon);
				request.setAttribute("character1", b.getPokemonr);
				request.setAttribute("type1",b.getPokemon) ;
				request.setAttribute("evolution1",b.getPokemonr);
				request.setAttribute("baseExp1", b.getPokemon);
			}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

				  Dragonite d = new Dragonite() {
					  msg = "<center>" + b.getpokemon() + "  #" + b.getPokemon;
						request.setAttribute("message1",b.getPokemon);
						request.setAttribute("character1", b.getPokemonr);
						request.setAttribute("type1",b.getPokemon) ;
						request.setAttribute("evolution1",b.getPokemonr);
						request.setAttribute("baseExp1", b.getPokemon);
					}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew m = new Mew() {
				msg = "<center>" + b.getpokemon() + "  #" + b.getPokemon;
				request.setAttribute("message1",b.getPokemon);
				request.setAttribute("character1", b.getPokemonr);
				request.setAttribute("type1",b.getPokemon) ;
				request.setAttribute("evolution1",b.getPokemonr);
				request.setAttribute("baseExp1", b.getPokemon);
			}
		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu p = new Pikachu() {
				msg = "<center>" + b.getpokemon() + "  #" + b.getPokemon;
				request.setAttribute("message1",b.getPokemon);
				request.setAttribute("character1", b.getPokemonr);
				request.setAttribute("type1",b.getPokemon) ;
				request.setAttribute("evolution1",b.getPokemonr);
				request.setAttribute("baseExp1", b.getPokemon);
			}
		
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
