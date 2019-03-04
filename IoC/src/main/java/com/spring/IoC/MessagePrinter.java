package com.spring.IoC;

public class MessagePrinter {
    final private MessageService service;
    private MessagePrinter(MessageService service){
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
