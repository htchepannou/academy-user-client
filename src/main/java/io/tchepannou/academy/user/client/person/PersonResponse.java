package io.tchepannou.academy.user.client.person;

import io.tchepannou.academy.user.client.BaseResponse;
import io.tchepannou.academy.user.client.dto.PersonDto;

public class PersonResponse extends BaseResponse {
    private PersonDto person;

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(final PersonDto person) {
        this.person = person;
    }
}
