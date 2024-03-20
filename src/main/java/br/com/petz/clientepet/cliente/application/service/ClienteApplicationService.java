package br.com.petz.clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criarCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criarCliente");
		log.info("[finaliza] ClienteApplicationService - criarCliente");
		return null;
	}

}
