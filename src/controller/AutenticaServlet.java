package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AutenticaServlet")
public class AutenticaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AutenticaServlet() {super();       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
			ServletContext sc = getServletContext();
			
			HashMap<String, String> usuarios = (HashMap<String, String>) sc.getAttribute("usuarios");		
			
			String usuario = request.getParameter("login");
			if(usuarios.containsKey(usuario)){
				String senha = usuarios.get(usuario);
				if (senha.equals(request.getParameter("senha"))){				
					HttpSession session = request.getSession();
					System.out.println("logado");
					session.setAttribute("login", usuario);
					request.getRequestDispatcher("/condomino.jsp").forward(request, response);				
				}
				else{
					request.getRequestDispatcher("/erro.html").forward(request, response);
				}
					
			}else 		
				request.getRequestDispatcher("/usuarioinexistente.html").forward(request, response);
		
	}

}
