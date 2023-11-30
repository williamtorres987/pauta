package com.votacao.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

import com.votacao.pauta.models.Stave;
import com.votacao.pauta.repository.StaveRepository;
import com.votacao.pauta.service.StaveService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

//Usamos essa anotação para dizer que essa classe é uma classe responsavel por testes
@RunWith(MockitoJUnitRunner.class)
public class StaveServiceTest {

  //@Mock SERVE PARA MOCAR UMA DEPENDENCIA(INSTANCIAR)
  @Mock
  private StaveRepository staveRepository;

  //@InjectMocks PODEMOS USAR PARA MOCAR UM SERVIÇO
  @InjectMocks
  private StaveService service;

  //USAMOS O @Test para dizer que a função é um teste
  @Test
  public void shouldCreateStave(){
    //CRIANDO UM OBJETO
    Stave stave = new Stave();
    stave.setId(1L);
    stave.setDescription("description");

    //SIMULANDO UM SAVE DE REPOSITORY
    given(staveRepository.save(stave)).willReturn(stave);

    //ADICIONANDO O RETORNO DA FUNÇÃO QUE QUEREMOS TESTAR, DENTRO DA VARIAVEL RESULT
    var result = service.insertStave(stave);

    //CRIANDO ASSERTS PARA VALIDAR SE O RETORNO É O ESPERADO
    assertEquals(1L, result.getId());
    assertEquals("description", result.getDescription());
  }
}
