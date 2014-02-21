package dao;

import java.util.List;


import model.Condomino;



public class DAOCondomino extends DAOJPA<Condomino> {
		public DAOCondomino(){
			super();
		}
		
		/*@SuppressWarnings("unchecked")
		public List<Categoria> findByRemetente(String remetente){
			return (List<Contato>) super.findByQuery("select c from Contato c where c.remetente = \"" + remetente + "\"");
		}*/
		
		/*public Condomino findByLogin(String login){
			return (Condomino) super.findByQuery("select u from Condomino u where u.login = \"" + login + "\"");
		}*/
	}

