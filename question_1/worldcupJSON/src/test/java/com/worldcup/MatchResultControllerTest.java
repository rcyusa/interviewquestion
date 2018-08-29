package com.worldcup;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.worldcup.controller.MatchResultController;


@RunWith(SpringJUnit4ClassRunner.class)
public class MatchResultControllerTest {
	
private MockMvc mockMvc;
	
	@InjectMocks
	private MatchResultController matchResultController;
	
	@Before
	public void setUp() throws Exception{
		
		mockMvc = MockMvcBuilders.standaloneSetup(matchResultController).build();
		
	}

	@Test
	public void testUser() throws Exception{
		
		mockMvc.perform(get("/rest"))
		.andExpect(status().isOk());
	}

}
