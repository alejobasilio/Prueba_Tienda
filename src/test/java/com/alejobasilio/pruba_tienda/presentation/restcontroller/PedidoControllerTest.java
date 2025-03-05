package com.alejobasilio.pruba_tienda.presentation.restcontroller;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.services.PedidoService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(PedidoController.class)
class PedidoControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@MockitoBean
	private PedidoService pedidoService;
	
	 //JUnit test for
    @Test
     void givenPedidoObject_whenCreatePedido_thenResponseEntity() throws Exception {

        //given - precondition or setup

        PedidoDTOEntrada pedidoDTOEntrada = new PedidoDTOEntrada();
        
        
        PedidoDTOSalida pedidoDTOSalida = new PedidoDTOSalida();
        pedidoDTOSalida.setId(1L);
        
        
        given(pedidoService.transformarPedido(pedidoDTOEntrada)).willReturn(pedidoDTOSalida);
        
        //when - action or the behavior that we are going test
        
        ResultActions response = mockMvc.perform(post("/api/pedidos").contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(pedidoDTOEntrada)));

        //then - verify the output
        
        response.andExpect(status().isCreated());
    }
    
    //JUnit test for
	@Test
	void givenPedidoId_whenBorrarPedido_thenNothing() throws Exception {

		//given - precondition or setup
		willDoNothing().given(pedidoService).borrarPedidoById(1L);

		//when - action or the behavior that we are going test
		ResultActions response = mockMvc.perform(delete("/api/pedidos/{id}", 1L));
		
		//then - verify the output
		response.andExpect(status().isOk());
	}
}
