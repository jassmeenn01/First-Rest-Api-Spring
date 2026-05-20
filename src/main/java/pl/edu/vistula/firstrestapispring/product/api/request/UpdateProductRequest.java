package pl.edu.vistula.firstrestapispring.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateProductRequest extends ProductRequest {
    private final Long id;

    @JsonCreator
    public UpdateProductRequest(@com.fasterxml.jackson.annotation.JsonProperty("name") String name,
                                @com.fasterxml.jackson.annotation.JsonProperty("id") Long id) {
        super(name);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}