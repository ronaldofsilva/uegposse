package br.ueg.posse.si.p4;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloService {
    @WebMethod
    String sayHello(String name);
}

