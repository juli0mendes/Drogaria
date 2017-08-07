package br.com.juliomendes90.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Ignore;
import org.junit.Test;

import br.com.juliomendes90.drogaria.dao.ClienteDAO;
import br.com.juliomendes90.drogaria.dao.PessoaDAO;
import br.com.juliomendes90.drogaria.domain.Cliente;
import br.com.juliomendes90.drogaria.domain.Pessoa;

public class ClienteDAOTest {
	
	@Test
	@Ignore
	public void salvar() throws ParseException {
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2015"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

		System.out.println("Cliente salvo com sucesso.");
	}
}