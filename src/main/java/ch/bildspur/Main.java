package ch.bildspur;

import com.example.tutorial.AddressBookProtos.Person;

public class Main {

    public static void main(String[] args) {
        Person john =
                Person.newBuilder()
                        .setId(1234)
                        .setName("John Doe")
                        .setEmail("jdoe@example.com")
                        .addPhones(
                                Person.PhoneNumber.newBuilder()
                                        .setNumber("555-4321")
                                        .setType(Person.PhoneType.HOME))
                        .build();

        System.out.println(john.getEmail());
        System.out.println(john.toByteString());
    }
}
