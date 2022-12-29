package com.carreiras.reactiveexamples.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Ewerton on 29-12-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
}
