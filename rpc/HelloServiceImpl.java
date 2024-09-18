package br.ueg.posse.si.p4;

import javax.jws.WebService;

@WebService(endpointInterface = "br.ueg.posse.si.p4.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}

