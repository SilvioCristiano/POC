package com.poc.restservice;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xpto")
public class XptoController {

    @PostMapping(consumes = "application/xpto.com", produces = "application/xpto.com")
    public String handleXptoRequest(@RequestBody String xptoData) {
        return "Processed xpto data: " + xptoData;
    }
    @GetMapping(produces = "application/xpto.com; version=1")
    public String handleXptoGetRequest(@RequestParam(value = "data", required = false) String data, @RequestHeader(value = "Accept", defaultValue = "Not Provided") String acceptHeader) throws UnknownHostException {
    	System.out.println("Accept Header Recebido: " + acceptHeader);
        // Processa a requisição GET e usa o parâmetro de consulta "data"
        return "Processed xpto data: " + (data != null ? data : "No data provided") +  "Hello World Cloud Native  " + " HostName:  " + InetAddress.getLocalHost().getHostName() + " HostAddress:  " + InetAddress.getLocalHost().getHostAddress(); 
    }

}
