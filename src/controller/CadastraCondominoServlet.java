package controller;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Condomino;
import dao.DAOCondomino;
import dao.DAOJPA;


@WebServlet("/CadastraCondominoServlet")
public class CadastraCondominoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CadastraCondominoServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("condominio");
		DAOCondomino daoCondomino = new DAOCondomino();
		
				
		String nome_proprietario = request.getParameter("nomeproprietario");
		String apto = request.getParameter("apto");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String login = request.getParameter("loginCondomino");
		String senha = request.getParameter("senhaCondomino");
		String moradores_unidade = request.getParameter("moradoresunidade");
		
		Condomino condomino = new Condomino(nome_proprietario, apto, telefone, email, login, senha, moradores_unidade);
		

		daoCondomino.begin();
		daoCondomino.persist(condomino);
		daoCondomino.commit();
		daoCondomino.close();
		
		RequestDispatcher view = request.getRequestDispatcher("inicio.html");
		view.forward(request, response);
		
		/*cond = daoCondomino.findByLogin(login);
		
		if (cond == null){
			daoCondomino.persist(condomino);
			daoCondomino.commit();
		
		
			session.setAttribute("logado",condomino);
		
			RequestDispatcher view = request.getRequestDispatcher("inicio.html");
			view.forward(request, response);
		}
		
		else {
			RequestDispatcher view = request.getRequestDispatcher("cadastroCondomino.jsp");
			view.forward(request, response);	
		}
		daoCondomino.close();
	}*/
		
		
	}
		
}


