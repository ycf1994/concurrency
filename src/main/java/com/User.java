package com;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
}
