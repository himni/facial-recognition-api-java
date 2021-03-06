/*
 * facial recognition api
 * # Introducão  Seja bem-vindo a documentação da API de Reconhecimento Facial da [HIMNI.COM](https://himni.com)   Nossa API foi criada utilizando o padrão [REST](https://restfulapi.net/) e [HATEOAS](https://restfulapi.net/hateoas/), possibilitando a integração de seu sistema ao nosso, e está documentada abaixo.  # Como usar a API?  Logo a seguir você encontrará todos os recursos e métodos suportados pela API, sendo que essa página possibilita que você teste os recursos e métodos diretamente através dela.  # Autenticação  Você precisa de um [HTTP BEARER TOKEN](https://oauth.net/2/bearer-tokens/) para identificar a conta que está realizando solicitações para a API. Você pode obter seu token de autenticação no seu [Painel do Cliente](https://face.himni.com.br/).  Insira seu token no campo que se encontra topo desta página para testar os métodos da API.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.io.File;
import io.swagger.client.model.PersonGroupIdentify;
import io.swagger.client.model.PersonVerify;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecognitionApi
 */
@Ignore
public class RecognitionApiTest {

    private final RecognitionApi api = new RecognitionApi();

    /**
     * Person Group - Identify
     *
     * Identificação das correspondências mais próximas a uma imagem enviada, dentro de um Grupo de Pessoas. Será calculada a similaridade entre a imagem enviada e os modelos de reconhecimento facial cadastrados no Grupo de Pessoas, e será retornada uma listagem dos candidatos àquela Face ordenadas pelo índice de confiança.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personGroupIdentifyTest() throws ApiException {
        String personGroupUuid = null;
        File picture = null;
        List<PersonGroupIdentify> response = api.personGroupIdentify(personGroupUuid, picture);

        // TODO: test validations
    }
    /**
     * Person - Verify
     *
     * Verifica se a imagem enviada corresponde à uma Pessoa específica.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personVerifyTest() throws ApiException {
        String personUuid = null;
        File picture = null;
        PersonVerify response = api.personVerify(personUuid, picture);

        // TODO: test validations
    }
}
