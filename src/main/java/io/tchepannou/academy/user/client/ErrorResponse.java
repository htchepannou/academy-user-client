
package io.tchepannou.academy.user.client;

import io.tchepannou.academy.user.client.dto.ErrorDto;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse extends BaseResponse {

    private List<ErrorDto> errors = new ArrayList<ErrorDto>();

    public List<ErrorDto> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDto> errors) {
        this.errors = errors;
    }
}
