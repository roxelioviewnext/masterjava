package com.proyecto.microservicios;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.proyecto.model.Reserva;
import com.proyecto.service.ReservaService;

@SpringBootTest
@AutoConfigureMockMvc
class ReservaControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ReservaService service;

	@BeforeEach
	public void setUp() {
		Reserva reserva = new Reserva("Pepe", "11111", 1, 1, 10);
		when(service.getReservas()).thenReturn(Arrays.asList(reserva));
		when(service.getReserva("Pepe")).thenReturn(Arrays.asList(reserva));
	}

	@Test
	public void createReservaTest() throws Exception {
		doNothing().when(service).saveReserva(any(Reserva.class));
		mockMvc.perform(post("/reserva").contentType(MediaType.APPLICATION_JSON)
				.content("{" + "        \"nombreCliente\": \"Juan Pérez\"," + "        \"dni\": \"12345678A\","
						+ "        \"idVuelo\": 1001," + "        \"idHotel\": 1," + "        \"totPersonas\": 2"
						+ "    }"))
				.andExpect(status().isOk());
	}

	@Test
	public void getListTodasLasReservasTest() throws Exception {
		mockMvc.perform(get("/reserva")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].nombreCliente", is("Pepe")));

	}

	@Test
	public void getListTodasLasReservasByNombreTest() throws Exception {
		mockMvc.perform(get("/reserva/Pepe")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].nombreCliente", is("Pepe")));

	}

	@Test
	public void deleteReservaByIdTest() throws Exception {
		doNothing().when(service).deleteReserva(new Reserva());
		mockMvc.perform(delete("/reserva").contentType(MediaType.APPLICATION_JSON)
				.content("{" + "        \"nombreCliente\": \"Juan Pérez\"," + "        \"dni\": \"12345678A\","
						+ "        \"idVuelo\": 1001," + "        \"idHotel\": 1," + "        \"totPersonas\": 2"
						+ "    }"))
				.andExpect(status().isOk());
	}

}
