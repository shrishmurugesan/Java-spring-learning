package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { };

record Address (String firstLine, String city, String state) {
    public String printAddress() {
        return firstLine + ", " + city + ", " + state;
    }
};
@Configuration
public class HelloWorldConfiguraiton {

    @Bean
    public String name() {
        return "Shrish";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return  new Person("Divya",28, new Address("39 Buckland Street","Manchester","CT"));
        //System.out.println("The person's name is "+person.name()+" and is "+person.age()+" years old");
        //return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name="address2")
public Address address() {
        return new Address("75 Hockanum Blvd","Vernon","CT");
    }

    @Bean(name="address3")
    public Address address3(){
        return new Address("500 Cold Spring Road","Rocky Hill","CT");
    }
}
