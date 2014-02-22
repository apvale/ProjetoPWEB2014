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

import model.Colaborador;
import dao.DAOColaborador;
import dao.DAOJPA;


@WebServlet("/CadastraColaboradorServlet")
public class CadastraColaboradorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CadastraColaboradorServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("condominio");
		DAOColaborador daoColaborador = new DAOColaborador();
	
		
		String nome_colaborador = request.getParameter("nomeColaborador");
		String profissao = request.getParameter("profissao");
		String empresa = request.getParameter("empresa");
		String telefone = request.getParameter("telefone");
		String horario = request.getParameter("horario_atendimento");
	
		Colaborador colaborador = new Colaborador(nome_colaborador, profissao, empresa, telefone, horario);		

		daoColaborador.begin();
		daoColaborador.persist(colaborador);
		daoColaborador.commit();		
		daoColaborador.close();
		
		RequestDispatcher view = request.getRequestDispatcher("inicio.html");
		view.forward(request, response);
	}
		
}


